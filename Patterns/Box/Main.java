import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int cols = scanner.nextInt();

        for(int row=1;row<=rows;row++){
            for(int col=1;col<=cols;col++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
