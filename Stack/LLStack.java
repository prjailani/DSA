class Node {
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class Stack {
    Node top;
    
    void push(int data){
        Node newNode = new Node(data);
        if(top==null)
            top = newNode;
        else{
            newNode.next = top;
            top = newNode;
        }
    }

    boolean isEmpty(){
        return top==null;
    }

    void pop(){
        if(!isEmpty())
            top = top.next;
    }

    int peek(){
        return top.data;
    }

    void display(){
        Node temp = top;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LLStack{
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(0);
        System.out.println(st.peek());
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        st.pop();
        st.display();
    }
}