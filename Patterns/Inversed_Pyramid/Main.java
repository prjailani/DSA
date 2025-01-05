package Inversed_Pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        for(int row=1;row<=n;row++){
            for(int col=n;col>=n-row;col--){
                System.out.print(" ");
            }
            for(int col=5;col>=row;col--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
