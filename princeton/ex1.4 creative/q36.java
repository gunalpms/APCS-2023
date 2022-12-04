public class q36 {
    public static void main(String[] args) {

        int n = 2; // test sayısı "walker" sayısıyla aynı
        boolean [][] visited_cells = new boolean[n][n]; // n*n boyutlarında 2 boyutlu bir matrix yaratır
        visited_cells[n/2][n/2] = true; // merkezden başlanacağı için merkez true olmalıdır
        double random_decision; // rastgelelik değişkeni
        int cells_to_visit = n*n-1; // başlangıç noktası ziyaret edilmiş olduğundan n*n-1 olmalıdır
        int steps = 0; // adım sayısı başta 0dır
        int [] x = new int[n]; // bu array her bir n yürüyüşçü için bulunduğu kordinatı saklar
        int [] y = new int[n]; // aynısını y kordinatı için yapar

        // burada her bir yürüyüşçü için başlangıç kordinatı orta nokta (n/2) olarak belirlenir
        for (int i = 0; i<n; i++) {
            x[i] = n/2;
            y[i] = n/2;
        }

        // hücre kalmayınca algoritma durur
        while (cells_to_visit > 0) {
            // steps değişkeni her n yürüyüşçünün kolektif 1 adımını verir. 
            // yani mesela 6 yürüyüşçünün her biri 1 adım atarsa steps de 1 olur
            steps++;
            for (int w = 0; w<n; w++) { // w burada her bir yürüyüşçüyü temsil eder

                // 4 tane verilebilecek karar vardır
                // x yönünde ileri, geri veya y yönünde ileri, geri
                // her bir karar sonucunda x veya y kordinatındaki değer değişir.
                // soruda grid'den dışarı çıkamayacağına dair bir bilgi yok o yüzden
                // check yapmıyoruz değer değiştirirken.
                random_decision = Math.random();
                if (random_decision <= 0.25) {x[w]++;}
                else if (random_decision <= 0.50) {x[w]--;}
                else if (random_decision <= 0.75) {y[w]++;}
                else if (random_decision <= 1.00) {y[w]--;}

                // ama burada check yapmamız lazım çünkü hücre sayısını azaltmamız
                // ve ziyaret edilen hücreler matrixini değiştirebilmemiz için kordinatların 
                // 0 ve n arasında (dahil) olması şarttır.

                // bir diğer değişle 0 veya n arasında olmayan bir sayı ziyaret edilen hücreleri irdelemez
                // çünkü ziyaret edilebilecek hücreler 0 ve n (dahil) arasında yer alır.

                // son olarak eğer hücre önceden ziyaret edilmişse if çalışmaz çünkü
                // aynı hücreyi 2 kere saymak mantıksız olur
                if(x[w] >= 0 && x[w] < n && y[w] >= 0 && y[w] < n && !visited_cells[x[w]][y[w]]) {
                    cells_to_visit--;
                    visited_cells[x[w]][y[w]] = true;
                }
            }
        }

        System.out.println(steps*n); // steps her bir "döngü" için bir değişkendir yürüyüşçü sayısı ile çarparak
        // atılan toplam gerçek adım sayısını bulabiliriz.
    } 
}