class Node{
    Node left,right;
    int data, height;
    
    Node(int data){
        this.data = data;
        this.height = 1;
    }
}

class AVLTree{
    int height(Node n){
        return (n==null) ? 0 : n.height;
    }

    int balanceFactor(Node n){
        return (n==null) ? 0 : height(n.right)-height(n.left);
    }

    Node rightRotation(Node y){
        Node x = y.left;
        Node T2 = x.right;
        x.right = y;
        y.left = T2;
        

        y.height = Math.max(height(y.right),height(y.left))+1;
        x.height = Math.max(height(x.left),height(x.right))+1; // +1 because we are also adding the height of the root too

        return x;
    }

    Node leftRotation(Node x){
        Node y = x.right;
        Node T2 = y.left;
        y.left = x;
        x.right = T2;

        y.height = Math.max(height(y.right),height(y.left))+1;
        x.height = Math.max(height(x.left),height(x.right))+1; // +1 because we are also adding the height of the root too

        return y;
    }

    Node insert(Node node,int data){
        if(node==null)
            return new Node(data);
        if(data < node.data){
            node.left = insert(node.left,data);
        }
        else if(data > node.data){
            node.right = insert(node.right,data);
        }
        node.height = Math.max(height(node.left),height(node.right))+1;

        int bal = balanceFactor(node);

        if(bal<-1 && data < node.left.data) return rightRotation(node); // LL
        if(bal>1 && data > node.right.data) return leftRotate(node); // RR
        if(bal<-1 && data > node.left.data){ // LR
            node.left = leftRotation(node.left);
            return rightRotation(node);
        }
        if(bal>1 && data < node.right.data){//RR
            node.right = rightRotation(node.right);
            return leftRotation(node);
        }
        return node;
    }
}

class Main{
    public static void main(String[] args) {
        
    }
}