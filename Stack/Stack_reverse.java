import java.util.*;

class Stack
{
    int len;
    char arr[];
    int top;
    Stack(int len) 
    {
        this.len=len;
        arr=new char[len];
        top=-1;
    }

    boolean isEmpty()
    {
        if(top==-1)
            return true;
        return false;    
    }

    boolean isFull()
    {
        if(top+1==len)
            return true;
        return false;    
    }

    void push(char c)
    {
        top++;
        arr[top]=c;
    }

    char pop()
    {
        if(isEmpty())
        {
            
        }
        return arr[top--];
    
    }

    String rev()
    {
        int temp=top;
        StringBuilder res=new StringBuilder();
        while(!isEmpty())
        {
            res.append(pop());
        }
        top=temp;
        return res.toString();
    }
    
}
public class Stack_reverse 
{
    public static void main(String[] args) 
    {
        System.out.println("enter the string");    
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        Stack stack=new Stack(s.length());
        for(int i=0;i<s.length();i++)
        {
            stack.push(s.charAt(i));
        }

        System.out.println("reversed string : "+stack.rev());


    }
}
