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

        boolean flag = true;

        for(int i=0;i<rows-1;i++){
            for(int j=0;j<cols-1;j++){
                if(arr[i][j]!=arr[i+1][j+1]){
                    flag = false;
                    break;
                }
            }
            if(!flag) break;
        }

        if(flag)
            System.out.println("Toeplitz");
        else
            System.out.println("Not Toeplitz");
    }
}
