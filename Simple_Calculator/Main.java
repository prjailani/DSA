import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option=0;
        while(option!=5){
            System.out.println("Simple Calculator");
            System.out.println("Choose your operator");
            System.out.println("1. Addition\n2. Subtraction\n3. Multiplication\n4.Division\n5.Exit");

            System.out.print("Enter your choice: ");
            option = scanner.nextInt();
            if(option==5){
                break;
            }

            System.out.print("Enter the first Number: ");
            float num1 = scanner.nextFloat();
            System.out.print("Enter the second Number: ");
            float num2 = scanner.nextFloat();
            float ans=0.0f;

            switch (option) {
                case 1:
                    ans = num1 + num2;
                    break;
                
                case 2:
                    ans = num1 - num2;
                    break;
                
                case 3:
                    ans = num1 * num2;
                    break;                
                case 4:
                    ans = num1/num2;
                    break;
                default:
                    System.out.println("Invalid value");
                    break;
            }
            System.out.println("Ans = "+ans);
        }
    }
}
