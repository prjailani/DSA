package String_Problems.Frequency;
import java.util.Scanner;

public class Frequency2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.toLowerCase();
        int[] arr = new int[26]; // Frequency Array
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>=97 && s.charAt(i)<=122)
                arr[s.charAt(i)-97]++;
        }
        int max = 0;
        for(int i:arr){
            if(i>max)
                max = i;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==max){
                System.out.println((char)(i+97));
                System.out.println(max);
            }
        }
        sc.close();
    }
}
