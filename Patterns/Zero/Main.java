package Zero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the no.of.rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the no.of.cols: ");
        int cols = scanner.nextInt();

        for(int row=1;row<=rows;row++){
            for(int col=1;col<=cols;col++){
                if(row==1 || row==(rows)){
                    System.out.print("*");
                }
                else{
                    if(col==1 || col==(cols)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}
