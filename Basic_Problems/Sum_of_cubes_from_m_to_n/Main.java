import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt(), n = scanner.nextInt(), sum = 0;
        for(int i=m;i<=n;i++) {
            sum += i*i*i;
        }
        System.out.println("Sum = "+sum);
        scanner.close();
    }   
}