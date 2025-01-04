import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Food, Hotel, Review
        
        HashMap<String,String[]> map = new HashMap<>();
        map.put("Idly",{"Delhi Sweets"});

        System.out.println("Welcome to the Tomato App");

        System.out.println("What would you like to order today? Please select");
        System.out.println("Idly\nDosa\nBiriyani");

        int option = scanner.nextLine();


    }
}
