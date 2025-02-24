import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int sum1 = 0, sum2 = 0;
        for(int i=0;i<n;i++){
            sum1 += arr[i][i];
            sum2 += arr[i][n-i-1];
        }

        System.out.println("Primary diagonal sum = "+sum1);
        System.out.println("Secondary diagonal sum = "+sum2);
        
    }
}
