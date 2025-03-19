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

        for(int i=0;i<rows;i++){
            for(int j=i+1;j<cols;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols/2;j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][cols-j-1];
                arr[i][cols-j-1] = temp;
            }
        }

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){ 
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
