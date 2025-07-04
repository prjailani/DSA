class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DLL{
    Node head,tail;
    void create(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    void displayBackward(){
        Node temp = tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.prev;
        }
        System.out.println();
    }

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
    }

    void insertAtLast(int data){
        Node newNode = new Node(data);
        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    void insertAtPos(int pos, int data){
        if(pos<=1){
            insertAtBeginning(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1;i<pos-1 && temp!=null;i++)
            temp = temp.next;

        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        // Always do the operations on temp node first.
        newNode.next = temp.next;
        newNode.prev = temp;
        temp.next = newNode;
        temp.next.prev = newNode;
    }

    void deleteAtBeginning(){
        head = head.next;
        head.prev = null;
    }

    void deleteAtLast(){
        tail = tail.prev;
        tail.next = null;
    }

    void deleteAtPos(int pos){
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        if(temp.next=null)
            temp = temp.next;
        else{
            temp.next = temp.next.next;
            temp = temp.next;
            temp.prev = temp.prev.prev;
        }
    }

    void reverse(){
        head = tail;
        Node prev = head;
        while(tail!=null){
            Node temp = tail.next;
            prev = tail;
            tail.next = tail.prev;
            tail.prev = temp;
            tail = tail.next;
        }
        tail = prev;
    }
}

public class Main{
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.create(1);
        dll.create(2);
        dll.create(3);
        dll.create(4);
        dll.display();
        dll.displayBackward();
        dll.insertAtBeginning(0);
        dll.display();
        dll.insertAtLast(5);
        dll.display();
        dll.insertAtPos(1, 3);
        dll.display();
        dll.displayBackward();
        dll.deleteAtBeginning();
        dll.display();
        dll.displayBackward();
        dll.deleteAtBeginning();
        dll.display();
        dll.deleteAtLast();
        dll.deleteAtPos(3);
        dll.display();
        dll.displayBackward();
        dll.reverse();
        dll.display();
        dll.displayBackward();
    }
}