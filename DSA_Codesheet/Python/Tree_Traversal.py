#tree traversal in python
class Node:
    def __init__(self,item):
        
        self.left = None
        self.right = None
        self.val = item
def inorder(root):
    if root:
        #traverse left
        inorder(root.left)  
        #traverse root
        print(str(root.val)+ "->", end='') 
        #traverse right
        inorder(root.right) 

def postorder(root):
    if root:
        #traverse left
        postorder(root.left)  
        #traverse right
        postorder(root.right)
        #traverse root
        print(str(root.val)+ "->", end='') 

def preorder(root):
    if root:
        #traverse root
        print(str(root.val)+ "->", end='')   
        #traverse left
        preorder(root.left)
        #traverse right
        preorder(root.right) 

root = Node(1)
root.left = Node(2)
root.right = Node(3)
root.left.left = Node(4)
root.left.right = Node(5)


print("Inorder traversal")
inorder(root)
print("\nPreorder traversal")
preorder(root)
print("\nPostorder traversal")
postorder(root)
        

