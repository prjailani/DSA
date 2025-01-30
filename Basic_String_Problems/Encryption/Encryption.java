package Basic_String_Problems.Encryption;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] arr = s.split(" ");
        for(String i: arr){
            for(int j=0;j<i.length();j++){
                int temp = (i.charAt(j)+(i.length()-1-j));
                while(temp>122)
                    temp -= 26;
                char c = (char)temp;
                System.out.print(c);
            }
            System.out.print(" ");
        }
    }
}
