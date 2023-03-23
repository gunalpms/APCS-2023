from io import StringIO


b = StringIO()


class Node:

    def __init__(self, value):
        self.value = value
        self.left = None
        self.right = None

    def add(self, value):
        if self.value == None:
            self.value = value

        else:
            if value <= self.value:
                if self.left == None:
                    self.left = Node(value)
                else:
                    self.left.add(value)
                
            else:
                if self.right == None:
                    self.right = Node(value)
                else:
                    self.right.add(value)
    

def pre(r):

    if r is None:
        return
    else:
        
        print(r.value, end = "", file = b)

        pre(r.left)
        
        pre(r.right)

def post(r):

    if r is None:
        return
    else:

        post(r.left)
        post(r.right)
        print(r.value, end = "", file = b)



def getTraversals(input):
    lowerin = (input.upper())


    root = Node(lowerin[0])

    for i in lowerin[1:]:
        root.add(i)
    

    pre(root)
    print(" ", end = "", file = b)
    post(root)

    return b.getvalue



    
    


