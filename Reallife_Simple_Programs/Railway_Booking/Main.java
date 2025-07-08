import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter total No.of. Passengers: ");
        int count = scanner.nextInt();
        int cost = 0;

        for(int i=0;i<count;i++){
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            if (age>60){
                cost += 30;
            }
            else if (age<12){
                cost += 20;
            }
            else {
                cost += 50;
            }
        }
        if (cost>300) {
            cost *= 0.95;
        }
        System.out.println("Total cost = "+cost);
        scanner.close();
    }
}