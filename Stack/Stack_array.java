// isEmpty - underflow
// isFull - overflow

class Stack
{
    int data;
    int top;
    int arr[];
    Stack(int data1) 
    {
        this.data=data1;       
        arr=new int[data];
        top=-1;
    }    

    boolean isfull()
    {
        if(data-1==top)
        {
            System.out.println("stack is full");
            return true;
        }
        return false;    
    }

    boolean isEmpty()
    {
        if(top==-1)
        {
            System.out.println("stack is empty");
            return true;
        }
        
        return false;    
    }

    void push(int n)
    {
        
        if(!isfull())//true
        {
            top++;
            arr[top]=n;
            System.out.println(arr[top]+" is inserted into the stack");
        }
    }

    void pop()
    {
        if(!isEmpty())
        {
            System.err.println(arr[top]+" is popped from the stack");
            //arr[top]=Integer.MIN_VALUE; not needed
            top--;
        }
    }

    void top()
    {
        System.out.println("top element is : "+arr[top]+"  poaition is : "+(top+1));
    }

    void display()
    {
        int temp=top;
        System.out.println("display the element into the stack");
        while(!isEmpty())
        {
            System.out.println(arr[top]);
            top--;
        }
        top=temp;
    }

    
}
public class Stack_array 
{
    public static void main(String[] args) 
    {
        Stack stack=new Stack(5);
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        
        stack.top();

        stack.pop();

        stack.display();

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.isEmpty();
               

    }
}
