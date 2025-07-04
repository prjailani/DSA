import java.util.Scanner;

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

    int pop(){
        int ele = top.data;
        top = top.next;
        return ele;        
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

public class PostfixEval{
    public static void main(String[] args) {
        Stack st = new Stack();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        for(char c:s.toCharArray()){
            if(Character.isDigit(c)){
                st.push(c-'0');
            }
            else{
                int ele2 = st.pop();
                int ele1 = st.pop();

                switch (c) {
                    case '+':
                        st.push(ele1+ele2);
                        break;
                    
                    case '-':
                        st.push(ele1-ele2);
                        break;
                    
                    case '*':
                        st.push(ele1*ele2);
                        break; 
                    
                    case '/':
                        st.push(ele1/ele2);
                        break;
                    
                    default:
                        break;
                }

                // if(c=='+')
                //     st.push(ele1+ele2);
                // else if(c=='-')
                //     st.push(ele1-ele2);
                // else if(c=='*')
                //     st.push(ele1*ele2);
                // else
                //     st.push(ele1/ele2);
            }
        }
        System.out.println(st.peek());
    }
}