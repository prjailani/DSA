import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the clothes recommendation System!");
        System.out.print("Please enter the current temperature: ");
        try{
            float temp = scanner.nextFloat();
            if(temp<0){
                System.out.println("Don't forgot your gloves");
            }
            else if(temp<=10){
                System.out.println("Light Jacket will be helpful");
            }
            else if(temp<=20){
                System.out.println("Sunglasses would be a good idea");
            }
            else{
                System.out.println("Carry sunscreen to protect yourselves");
            }
        }
        catch(Exception e){
            System.out.println("Error! Wrong input given");
        }
        scanner.close();
    }
    
}
