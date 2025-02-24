import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<cols;i++){
            int sum = 0;
            for(int j=0;j<rows;j++){
                sum+=arr[j][i];
            }
            System.out.println(i+"th column sum = "+sum);
        }
    }
}
