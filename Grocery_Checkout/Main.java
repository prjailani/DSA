import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple Checkout");
        float n = 1.0f;
        float sum = 0;
        while(n!=0.0){
            System.out.print("Enter the price of the product and Enter 0 to exit: ");
            n = scanner.nextFloat();
            int quantity = 1;
            if(n!=0.0){
                System.out.print("Enter the quantity: ");
                quantity = scanner.nextInt();
            }
            sum += (n*quantity);
            System.out.println("The current total is: "+sum);
        }
        System.out.println("Thank you for using!");
        
    }
}