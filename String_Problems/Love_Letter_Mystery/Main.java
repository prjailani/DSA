import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        int f = str.length()/2-1;
        int s = f+1;
        if(str.length()%2==1)
            s++;
        
        int count = 0;
        while(s<str.length()){
            count += Math.abs((int)(str.charAt(f)-str.charAt(s)));
            s++;
            f--;
        }

        System.out.print(count);
    }
}
