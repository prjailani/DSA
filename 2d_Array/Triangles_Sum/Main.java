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
        
        int upper_sum = 0;
        int lower_sum = 0;
        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                upper_sum += arr[i][j];
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                lower_sum += arr[i][j];
            }
        }

        System.out.println("Upper Triangle Sum = "+upper_sum);
        System.out.println("Lower Triangle Sum =  "+lower_sum);
    }
}
