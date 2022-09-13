# 4 milyona kadar olan fib sayilarinin toplami

fib(n) = n < 2 ? n : fib(n-1) + fib(n-2)


reslist = Int64[]

for i = 1:43 # implementing a while check to see if the result of fib(i) is smaller than 4000000 
             # causes a very long wait time for some reason. Considering 43 is the first fib(n)
             # that exceeds 4 million I hardcoded the value
    if fib(i) % 2 == 0
    push!(reslist, fib(i)) end
end

print(sum(reslist))


