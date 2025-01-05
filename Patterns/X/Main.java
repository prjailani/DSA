package X;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any odd number: ");
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];
        if(n%2==0){
            System.out.println("Invalid even number entered!");
            return;
        }

        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(row==col || (row==(n-col-1))){
                    matrix[row][col] = 1;
                }
            }
        }
        for(int row=0;row<n;row++){
            for(int col=0;col<n;col++){
                if(matrix[row][col]==1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }    
}
