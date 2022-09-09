# get N number and convert to int
N_string = readline()
N = parse(Int, N_string)

# get P number and convert to int
P_string = readline()
P = parse(Int, P_string)

# get the Pth digit from the right
new_P = length(N_string)-P

# divide our N number into a left side and right side and create empty arrays to convert
# the string values to integer values 
left_P = N_string[1:new_P]
left_P_int = Int64[]
right_P =N_string[new_P+2:end]
right_P_int=Int64[]

# arrays for the transformed left and right side
left_transformed = Int64[]

right_transformed = Int64[]

P = N_string[end-P+1] # P is now the value of the digit instead of the index
P = parse(Int, P)

# converts left side to integer 
for i in left_P
    i = parse(Int, i)
    push!(left_P_int, i)
end

# converts right side to integer
for i in right_P
    i = parse(Int, i)
    push!(right_P_int, i)
end

# for every digit in the left side adds P and takes the modulus 10
for i in left_P_int
    i_int = i
    i_digit = mod((i_int + P), 10)
    push!(left_transformed, i_digit)
end

# for every digit in the right side subtracts P and gets absolute value then takes the modulus 10
# the modulus is not required but it is there because I've copy pasted the code for the left side
for i in right_P_int
    i_int = i
    i_digit = mod(abs(i_int-P), 10)
    push!(right_transformed, i_digit)
end

# adds the P number to the left array 
push!(left_transformed, P)
# combine both arrays in a 1 dimensional vector plane to get a final result of a list with the desired
# integers as an output
final = cat(left_transformed, right_transformed, dims = (1,1))
println(final)


