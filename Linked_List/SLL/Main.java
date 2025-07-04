class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class SinglyLL{
    Node head,tail;
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    void create(int data){ // Insert at last
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
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

    void minmax(){
        Node temp = head;
        while(temp!=null){
            min = Math.min(min,temp.data);
            max = Math.max(max,temp.data);
            temp = temp.next;
        }

        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
    }

    void sum(){
        Node temp = head;
        while(temp!=null){
            sum+=temp.data;
            temp = temp.next;
        }
        System.out.println("Sum = "+sum);
    }

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int pos, int data){
        Node newNode = new Node(data);
        Node temp = head;
        for(int i=1;i<pos-1 && temp!=null;i++){ 
            temp = temp.next;
        }
        if(temp==null){
            System.out.println("Invalid Position");
            return;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void deleteByPosition(int pos){
        Node temp = head;
        for(int i=1;i<pos-1;i++)
            temp = temp.next;
        temp.next = temp.next.next;
    }

    void deleteAtBeginning(){
        head = head.next;
    }


    void deleteByValue(int val){
        Node temp = head;
        while(temp.next!=null && temp.next.data!=val ){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }

    void sort(){
        Node temp = head;
        while(temp!=null){
            Node min = temp;
            Node ind = temp.next;
            while(ind!=null){
                if(ind.data<min.data){
                    min = ind;
                }
                ind = ind.next;
            }
            
            int curr = min.data;
            min.data = temp.data;
            temp.data = curr;
            temp = temp.next;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SinglyLL LL = new SinglyLL();
        LL.create(2);
        LL.create(3);
        LL.create(4);
        LL.create(5);
        LL.create(6);
        LL.create(7);
        LL.display();
        LL.minmax();
        LL.sum();
        LL.insertAtBeginning(1); 
        LL.display();
        LL.insertAtPosition(5, 999);
        LL.display();
        LL.deleteByPosition(2);
        LL.display();
        LL.deleteAtBeginning();
        LL.display();
        LL.deleteByValue(999);
        LL.insertAtBeginning(9);
        LL.display();
        LL.sort();
        LL.display();
    }        
}
