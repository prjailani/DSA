public class Main{
    public static void main(String[] args) {
        int n = 5471;
        int res = 0;
        int pw = 1;
        while(n/10>9){
            res = 0;
            pw = 1;
            while(n>9){
                int ld1 = n%10;
                int ld2 = (n/10)%10;
                int diff = Math.abs(ld1-ld2);
                res = res + (diff*pw);
                pw *=10;
                n = n/10;
            }
            n = res;
        }
        System.out.println(res);
    }
}