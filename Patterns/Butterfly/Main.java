import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        
        for(int i=0;i<n*2-1;i++){
            for(int j=0;j<n*2;j++){
                if(i<n){
                    if(j<=i){
                        System.out.print("* ");
                    }
                    else{
                        if(n*2-j-2<i){
                            System.out.print("* ");
                        }
                        else{
                            System.out.print("  ");
                        }
                    }
                }
                else{
                    if(j>i){
                        System.out.print("* ");
                    }
                    else{
                        if(n*2-j-2<i)
                            System.out.print("  ");
                        else
                            System.out.print("* ");
                    }
                }
            }
            System.out.println();
        }
    }
}