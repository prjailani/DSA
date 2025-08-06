import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt(); // Eatable Bananas
        int j = sc.nextInt(); // Eatable Peanuts
        int m = sc.nextInt(); // Total Baanna
        int p = sc.nextInt(); // Total Peanuts

        if(k==0 || j==0){
            System.out.println("INVALID INPUT");
            return;
        }

        int ans = n - (int)Math.ceil(m/(float)k) - (int)Math.ceil(p/(float)j);
        System.out.println(ans);
    }
}