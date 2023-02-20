colons = int(input())

firstrow = str(input())
secondrow = str(input())

firstrow = firstrow.translate(str.maketrans('', '', ' \n\t\r'))
secondrow = secondrow.translate(str.maketrans('', '', ' \n\t\r'))

firstrow = "0" + firstrow + "0"
secondrow = "0" + secondrow + "0"

meters = 0

for ind, i in enumerate(firstrow[1:-1]):
    local = 3
    if firstrow[ind+1] == str(1):
        if firstrow[ind] == str(1):
            local -= 1
        if firstrow[ind+2] == str(1):
            local -= 1
        if (ind%2 == 0) and secondrow[ind+1] == str(1):
            local -= 1
    else:
        local = 0    
    
    meters += local

for ind, i in enumerate(secondrow[1:-1]):
    local = 3
    if secondrow[ind+1] == str(1):
        if secondrow[ind] == str(1):
            local -= 1
        if secondrow[ind+2] == str(1):
            local -= 1
        if (ind%2 == 0) and firstrow[ind+1] == str(1):
            local -= 1
    else:
        local = 0    
    
    meters += local

print(meters)
