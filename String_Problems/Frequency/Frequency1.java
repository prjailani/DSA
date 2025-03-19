package String_Problems.Frequency;
import java.util.Scanner;

public class Frequency1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int max = 0,count=1;
        char c = s.charAt(0);
        for(int i=0;i<s.length();i++){
            count = 1;
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j))
                    count++;
            }
            if(count>max && s.charAt(i)!=' '){
                max = count;
                c = s.charAt(i);
            }
        }
        System.out.println("Maximum occuring character is "+c+" and the frequency is "+max);
    }
}
