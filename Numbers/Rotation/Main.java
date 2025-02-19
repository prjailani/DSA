package Numbers.Rotation;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int len = 0;
        int copy = n;
        while(copy!=0){
            copy/=10;
            len++;
        }

        int k = sc.nextInt();
        
        k %= len;
        if(k<0) //left rotaion
            k += len;
        
        int left = n/(int)Math.pow(10,k);
        int right = n%(int)Math.pow(10,k);
        n = right*((int)Math.pow(10,len-k))+left;
        System.out.println(n);
    }
}