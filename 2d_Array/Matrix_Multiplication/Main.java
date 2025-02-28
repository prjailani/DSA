import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows1 = sc.nextInt();
        int cols1 = sc.nextInt();

        int arr1[][] = new int[rows1][cols1];

        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols1;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        
        int rows2 = sc.nextInt();
        int cols2 = sc.nextInt();

        int arr2[][] = new int[rows1][cols1];

        for(int i=0;i<rows2;i++){
            for(int j=0;j<cols2;j++){
                arr2[i][j] = sc.nextInt();
            }
        }

        if(cols1!=rows2){
            System.out.println("These two matrices can't be multiplied");
            return;
        }

        int[][] arr3 = new int[rows1][cols2];

        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                for(int k=0;k<cols1;k++){
                    arr3[i][j] += arr1[i][k]*arr2[k][j];
                }
            }
        }

        for(int i=0;i<rows1;i++){
            for(int j=0;j<cols2;j++){
                System.out.print(arr3[i][j]+" ");
            }
            System.out.println();
        }

    }
}
