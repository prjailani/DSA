import java.util.Scanner;

class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

class SLL {
    Node head, tail;

    void insertAtBeginning(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }

    void insertAtLast(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    void insertAtPos(int val, int pos1, int pos2) {
        Node newNode = new Node(val);
        Node temp = head;
        while(temp.val!=pos1 && temp.val!=pos2){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    void delAtFirst() {
        head = head.next;
    }

    void delAtLast() {
        Node temp = head;
        while (temp != tail && temp.next != tail) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        tail = temp;
    }

    void delByPos(int pos) {
        Node temp = head;
        for (int i = 1; i < pos - 1; i++)
            temp = temp.next;
        temp.next = temp.next.next;
    }

    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Excercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SLL sll = new SLL();

        System.out.println("Enter. No. Of. Nodes to insert");
        int n = sc.nextInt();
        System.out.println("Enter the values");
        for (int i = 0; i < n; i++)
            sll.insertAtLast(sc.nextInt());

        sll.display();
        System.out.print("Insert at beg val:");
        sll.insertAtBeginning(sc.nextInt());
        sll.display();

        System.out.print("Insert at end val");
        sll.insertAtLast(sc.nextInt());
        sll.display();

        System.out.println("Position & val");
        sll.insertAtPos(sc.nextInt(),sc.nextInt(), sc.nextInt());
        sll.display();

        sll.delAtFirst();
        sll.display();

        sll.delAtLast();
        sll.display();

        System.out.println("Position to del");
        sll.delByPos(sc.nextInt());
        sll.display();
    }
}