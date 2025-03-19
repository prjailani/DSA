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

        // int arr2[][] = new int[rows][cols];

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         arr2[i][j] = arr[i][j]+arr[j][i];
        //     }
        // }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(arr2[i][j]+" ");
        //     }
        //     System.out.println();
        // }

        for(int i=0;i<rows;i++){
            for(int j=i;j<cols;j++){
                arr[i][j] += arr[j][i];
                arr[j][i] = arr[i][j];
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
