// Infix : A + B * C
// Prefix : + A * B C    ---> op + v1 + v2
// Postfix : A B C * +   ---> v1 + v2 + op

import java.util.Scanner;
import java.util.Stack;
import java.util.HashMap;

public class InfixToPrefix{

    static void doOperation(Stack<Character> operatorStack, Stack<String> operandStack){
        char op = operatorStack.pop();
        String ele2 = operandStack.pop();
        String ele1 = operandStack.pop();
        operandStack.push(op+ele1+ele2);
    }

    static int precendenceOfOperator(char c){
        if(c=='+' || c=='-') return 1;
        else if(c=='(') return 0;
        return 2; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Stack<Character> operatorStack = new Stack();
        Stack<String> operandStack = new Stack();
        String s = sc.next();

        for(char c:s.toCharArray()){
            if(c==')'){
                while(operatorStack.peek()!='('){
                    doOperation(operatorStack, operandStack);
                }
                operatorStack.pop();
            }

            else if(c=='(')
                operatorStack.push(c);
            
            else if("+-/*".contains((c+""))){
                if(operatorStack.isEmpty() || (precendenceOfOperator(operatorStack.peek())<precendenceOfOperator(c)))
                    operatorStack.push(c);
                else
                    doOperation(operatorStack, operandStack);
            }
            
            else{
                operandStack.push(c+"");
            }
        }
        while(!operatorStack.isEmpty()){
            doOperation(operatorStack, operandStack);
        }
        System.out.println(operandStack.peek());
    }
}