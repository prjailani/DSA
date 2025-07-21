class Node{ 
    //properties of node
    int data;
    Node left;
    Node right;
    
    //constructor - assigns the property values at the time of creation
    Node(int data){ //4
        this.data = data;
    }
    
    
    
}

class Tree{
    Node root;
     
     
    // functions / methods of tree 
    
    
    void insertionHelper(Node nn,Node currentNode){
        int val = nn.data;
        if(val < currentNode.data){
            // insert at left of the current node 
            if(currentNode.left == null) currentNode.left = nn;
            else{
                insertionHelper(nn,currentNode.left);
            }
        }
        else{
            
            
            //insert the new node at the right of the current node
            if(currentNode.right == null) currentNode.right = nn;
            else{
                insertionHelper(nn,currentNode.right);
            }
            
            
        }
        
        
    }
    
    void insert(int data){ //2
        
          Node newNode = new Node(data); //3
          if(root == null){
            root = newNode;//6
            return;
          }
          
          insertionHelper(newNode,root);
    
    }
    
    
    
}


class Main{
    
    public static void main(String[]args){
        Tree tree1 = new Tree();
        tree1.insert(7);//1
        tree1.insert(4);
        tree1.insert(9);
        tree1.insert(13);
        tree1.insert(10);
        
    }
}
    
    
    
