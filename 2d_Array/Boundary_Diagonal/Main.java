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

        for(int c=0;c<cols;c++){
            System.out.print(arr[0][c]+" ");
        }

        for(int r=1;r<rows;r++){
            System.out.print(arr[r][cols-1]+" ");
        }

        for(int c=cols-2;c>=0;c--){
            System.out.print(arr[rows-1][c]+" ");
        }

        for(int r=rows-2;r>=1;r--){
            System.out.print(arr[r][0]+" ");
        }

    }
}
