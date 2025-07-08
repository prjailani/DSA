import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,String>  database = new HashMap<>();
        String username="",password="";
        database.put("Abdul", "password");
        database.put("Bharanidharan","123456789");
        database.put("Dharaneesh","Admin@123");

        boolean flag = false;
        while(!flag){
            System.out.print("Enter the username: ");
            username = scanner.next();
            System.out.print("Enter the password: ");
            password = scanner.next();

            try {
                String pass = database.get(username);
                if(pass.equals(password)){
                    flag=true;
                }
                else{
                    System.out.println("Wrong Password");
                }
            } catch (Exception e) {
                System.out.println("Wrong Username");
                continue;
            }
        }
        System.out.println("Welcome "+username);
    }
}
