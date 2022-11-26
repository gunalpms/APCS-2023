# bu calismayi yaparken MIT Computational Thinking video serisinden oldukca faydalandim
# kesinlikle bu isler icin en iyi kaynak oldugunu soyleyebilirim 
#

using Images, ImageView, Statistics

im = load("im0.jpg")

function brightness(i) 
    # bu fonksiyon bir pixelin parlaklığını hesaplar. 
    # pixel parlaklığı hesaplanırken eşit değerler verilmez çünkü
    # insan gözü rgb bir görsele bakarken yeşile yüksek bir önem veriyor

    return 0.3 * i.r + 0.59 * i.g + 0.11 * i.b
end

function calculate_energy(i)
    # bu fonksiyon da x ve y eksenlerinde sobel filtresi kullanarak "edge detection" yapıyor.
    # edge detection yaparken her pixel işleniyor ama işlenen pixeller orijinal görseldekiler yerine
    # parlaklık değerleri üzerinden yapılıyor. parlaklık değerleri bir bakıma RGB -> Grayscale işlemidir

    x_energy = imfilter(brightness.(i), Kernel.sobel()[2])
    y_energy = imfilter(brightness.(i), Kernel.sobel()[1])

    # simdi rms aliyoruz (neden bilmiyorum ama algoritma boyle istiyor sanirim vektor toplami gibi olmasi icin)

    return sqrt.(x_energy.^2 + y_energy.^2)
end

function calculate_energy_map(energy)
    # iste burada newton algoritmasi tarzi bir sey kullaniyoruz. seam carvingdeki her bir "seam"i
    # bulabilmek adına yapmamız gereken iş en düşük enerjili piksellerden geçecek bir yol bulmak 
    # ancak bunu brute force ile yaparsak n görselin yükseliği olmak üzere 3^n gibi bir 
    # computational complexity ile karşılaşmış olacağız. bunu o(n) düzeyine indirebilmek için
    # energy map adı verilen bir hesaplama yapıyor olacağız. bu hesaplamanın amacı her bir pixele
    # o pikselden başlayacak bir seam'in minimum enerji değerini atamaktır. alttan üste başlayacak 
    # şekilde bu yapıldığı zaman hem brute force'tan daha verimli hem de greedy algorithm'den daha 
    # isabetli bir şekilde doğru yolu bulabilecek bir algoritma yazmış oluyoruz

    energy_map = zeros(size(energy))    # unutmamak gerekir ki energy adı verdiğimiz şey orijinal görselin
                                        # parlaklık değerlerinden çıkan bir "edge detected image"dır

    next_elements = zeros(Int, size(energy_map)) # burada dummy matrix var bunun icine "yonleri" koyuyoruz
                                        # bu yonler bir pixelden asagi inen seam'in hangi yonde
                                        # gitmesi gerektigini belirliyor. (sol -1 asagi 0 sag +1)
    energy_map[end,:] = energy[end,:]   # mantiken energy mapin son satiri energy ile ayni olmali
                                        # cunku zaten energy map olustururken en alttan basliyoruz
    
    # burada 1. boyutta (yani yukseklikte) son satiri atlayip alttan en uste kadar loop yapiyoruz
    for i = size(energy)[1]-1:-1:1 
        for j = 1:size(energy)[2] # burada da sutunlari soldan saga iterate ediyoruz
            # bakacagimiz 3lu matriksin sol siniri 
            # (max var cunku sol sinirin disina tasmak istemeyiz)
            left = max(1, j-1) 
            # ayni mantikta 3lu matriksin sag sinirini da disari tasmamasi adina sinirliyrouz
            right = min(j+1, size(energy)[2]) 
            # burada pikselin yukarida bahsedilen en dusuk enerji degeri (local_energy) ve 
            # yonu (next_elements) hesaplaniyor. energy_map yukseklik endeksi i+1 ve her yataydaki iteration
            # yani j icin left:right ile tanimlanan 3lu matriksin minimum degeri ataniyor bu iki degere
            local_energy, next = findmin(energy_map[i+1, left:right])
            
            # var olan enerji degerine hesaplanan degeri ekleyerek final enerji degerine ulasiyoruz
            energy_map[i, j] += local_energy + energy[i, j]
            # 2 cikarmamizin sebebi 1 2 3 olabilecek degerleri -1 0 1 yapmak yani tamamen gosterimsel
            # bakacak olursaniz energy_mapten gelebilecek maksimum deger 3 iken minimum deger 1dir
            next_elements[i, j] = next - 2

            # burada son olarak bir "edge case" ele almak zorundayiz sayet left 1 olursa seam'in 
            # sola gitmesi programi crashler cunku gorselin en solunda oluyoruz. sagda bu problem
            # olamaz cunku matriks ilerlerken saga "carpip" duruyor. sonuc olarak
            # seam'in sola gidememesi adina next_elements degerine 1 ekliyoruz 
            if left == 1
                next_elements[i, j] += 1
            end
        end
    end                     

    return energy_map, next_elements
end

# simdi spesifik bir pixelden baslayan seam'i bulan algoritmaya gecebiliriz
function find_specific_seam(next_elements, start_pixel)
    # dikey eksende next_elements kadar yukseklikte bir array yarattik
    seam = zeros(Int, size(next_elements)[1]) 
    # basladigimiz yer sonucta
    seam[1] = start_pixel 
    # 2 cunku ilk elemani zaten biz belirledik
    for i = 2:length(seam) 
        # i'yi burada yataydaki kordinat olarak dusunmemiz lazim hesapladigimiz sey dikeyde nereye 
        # tekabul edecegi bir baska deyisle her satirda nereye ilerlememiz gerektigini hesapliyoruz
        # bir oncekinin seaminden gide gide baslangictakine gore bulabiliriz. burada yaptigimiz sey
        # bir oncekinin kordinatini bulup buna bir oncekinin next elementini eklemek bu sayede 
        # bir oncekindeki next element gidilecek yonu bize verdiginden dolayi dogru yolda ilerleyebiliriz
        # butun bu yaptigimiz zahmet burada sonuc veriyor ki brute force'tan kurtulabilelim
        seam[i] = seam[i-1] + next_elements[i, seam[i-1]] 
    end

    return seam
end

# bu fonksiyon da bize en dusuk enerjili tepe satirdaki piksellerdeki seam'i veriyor. 
# energy map sayesinde bunu her defasinda hesaplamamiza gerek yok. burada fonksiyonu
# defalarca cagirip hesaplatiyor gibi gorunsek de julia'nin guzelligi bunu optimize
# edip hafizada ayni parametreyle cagrilan fonksiyonun return degerini tutabilmesinden 
# geliyor
function find_seam_at_minimum(energy)
    energy_map, next_elements = calculate_energy_map(energy)
    # burasi bize en dusuk enerjili baslangic pixelini verecek
    _, min_elem = findmin(energy_map[1:end]) 
    # buldugumuz optimal yerdeki seam'i hesaplar
    return find_specific_seam(next_elements, min_elem) 
end

# simdi de bulunan seam'i gorselden cikartan fonksiyon var. bu fonksiyonun calisma prensibi her satirda
# seam'in isaret ettigi piksele kadar ve o pikselden sonraki pikselleri tutup seam'i devre disi birakmak

function remove_seam(img, seam)
    # bu degiskende seam'in cikartilamsi sonucu elde edilecek cozunurluk tutulur. 
    # yatayda ayni dikeyde 1 eksik olmasi gerekiyor orijinal gorsele gore
    imres = (size(img)[1], size(img)[2]-1)
    # cikis gorseli icin array tanimlanir. undef burada bilinmeyen rgb bit sayisi icin kullanilir
    result = Array{RGB}(undef, imres)

    # simdi seam'i dikey bir array olarak dusunursek her satirdan seamdeki pixeli cikartiyor olacagiz
    for i = 1:length(seam)
        # eger en sagda veya solda degilsek ve asagi tasmadiysak yukaridaki mantikla ayni sekilde
        # i satirinda seamin sagini ve solunu aliyoruz
        if seam[i] > 1 && seam[i] < size(img)[2]
            result[i, :] .= vcat(img[i, 1:seam[i]-1], img[i, seam[i]+1:end])
        
        # eger seam en soldaysa en soldaki pikseli atip sagi tutuyoruz
        elseif seam[i] == 1
            result[i, :] .= img[i, 2:end]
        # eger seam en sagdaysa en sagdaki pixeli atip solu tutuyoruz
        elseif seam[i] == size(img)[2]
            result[i, :] .= img[i, 1:end-1]
        end
    end

    return result
end

# VE SON OLARAK GORSEL VE YATAY COZUNURLUK BILGISI ILE SEAM CARVINGLI IMAGE CIKTISI VEREN FONKSIYON!

function seam_carve(im, res)

    if res < 0 || res > size(im)[2]
        error("resolution is either lower than 0 or larger than the horizontal resolution of the image")
    end

    # ulasmak istedigimiz resolution cikartiliyor ki o kadar seam carving yapalim
    for i = (1: size(im)[2] - res) 
        energy = calculate_energy(im)
        seam = find_seam_at_minimum(energy)
        im = remove_seam(im, seam)
        write(img, i)
    end

    return img
end

im = load("im0.jpg")
seam_carve(im, 50)
