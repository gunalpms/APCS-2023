length = int(input())

mountains = str(input())

a = mountains.split()

a = [int(i) for i in a]



sol = []
for i in range(1, length+1):
    avl = []
    for j in range(0, length-i+1):
        mountains_local = a[j:j+i]
        #print("ml: "+ mountains_local)
        
        n = len(mountains_local)//2 + len(mountains_local)%2
        #print("n:"+ str(n))
        b = 0
        for k in range(0, n):
            b = b + abs((mountains_local[k]) - (mountains_local[len(mountains_local)-k-1]))
        
        avl.append(b)
    
    #print(avl)
    if len(avl)>0:
        sol.append(min(avl))
    else:
        sol.append(0)
        #sol.append(min(avl))

for i in sol:
    print(str(i) + " ", end = "")




