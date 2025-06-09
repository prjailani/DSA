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

        // for(int i=1;i<rows;i+=2){
        //     for(int j=0;j<cols/2;j++){
        //         int temp = arr[i][j];
        //         arr[i][j] = arr[i][cols-j-1];
        //         arr[i][cols-j-1] = temp;
        //     }
        // }

        // for(int i=0;i<rows;i++){
        //     for(int j=0;j<cols;j++){
        //         System.out.print(arr[i][j]+" ");
        //     }
        //     System.out.println();
        // }


        // Just Printing without modifying the array
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(i%2==0)
                    System.out.print(arr[i][j]+" ");
                else
                    System.out.print(arr[i][cols-j-1]+" ");
            }
            System.out.println();
        }
    }
}
