# listeler 3 ve 5in katlarini eleman olarak tutmak icin
multipleof3 = Int64[] 
multipleof5 = Int64[]

# 1den 1000e kadar tum sayilari elden gecir, 3e bolunuyorsa listeye ekle
for i = 1:1001
    if i%3==0
    push!(multipleof3, i) end
end

# 1den 1000e kadar tum sayilari elden gecir, 5e bolunuyosa listeyi ekle
for i = 1:1001
    if i%5==0
    push!(multipleof5, i) end
    
end

# listelerdeki elemanlari topla
sum3, sum5 = sum(multipleof3), sum(multipleof5)

#iki listenin toplamini topla ve yazdir
println(sum3+sum5)