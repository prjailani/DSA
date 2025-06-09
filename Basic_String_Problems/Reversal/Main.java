package placement.Basic_String_Problems.Reversal;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        char[] arr = s.toCharArray();
        
        int start=0,end = arr.length-1;
        while(start<end){
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(arr);
    }
}
