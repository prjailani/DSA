import java.util.*;

class Node{
    int data;
    List<Node> children;
    Node (int data){
        this.data = data;
        this.children = new ArrayList<>();
    }
}

class Main{
    static void inOrder(Node root){
        for(int i=0;i<root.children.size()-1;i++)
            inOrder(root.children.get(i));
        System.out.print(root.data+" ");
        if(root.children.size()>0)
            inOrder(root.children.get(root.children.size()-1));
    }
    static void preOrder(Node root){
        System.out.print(root.data+" ");
        for(Node i:root.children)
            preOrder(i);
    }

    static void postOrder(Node root){

    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);

        root.children.add(n2);
        root.children.add(n3);
        root.children.add(n4);
        root.children.add(n5);
        root.children.add(n6);
        n4.children.add(n7);

        // inOrder(root);
        preOrder(root);
    }
}