package Rotated_Pyramid;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any odd number: ");
        int n = scanner.nextInt();

        if(n%2==0){
            System.out.println("Invalid even input!");
            return;
        }

        for(int row=1;row<=(n/2)+1;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int row=n/2;row>=1;row--){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
