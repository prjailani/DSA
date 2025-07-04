import java.util.Scanner;

class Queue{
    int[] q_arr;
    int size;
    int front;
    int rear;

    Queue(int size){
        this.size = size;
        q_arr = new int[size];
        front = -1;
        rear = -1;
    }

    boolean isFull(){
        return rear == size - 1;
    }

    boolean isEmpty(){
        return front>rear || front==-1;
    }

    void enqueue(int val){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        if(rear==-1)
            front++;
        rear++;
        q_arr[rear%size] = val;
        System.out.println(q_arr[rear%size]+" is inserted into queue");
    }

    void dequeue(){
        if(isEmpty()){
            System.out.println("No possibility to remove");
            return;
        }
        int ele = q_arr[front%size];
        front++;
        size--;
        System.out.println("Removed from "+ele);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue q = new Queue(10);
        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.enqueue(40);
        q.enqueue(50);
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
