public class Main {
    public static void main(String[] args) { 
        int[] arr = {2,2,1,3,2};
        int ind  = 4;
        int m = 2;
        int d = 4;

        int sum = 0;
        for(int i=0;i<m;i++){
            sum += arr[i];
        }
        int count = 0;
        if(sum==d)
            count++;
        for(int i=m;i<arr.length;i++){
            sum -= arr[i-m];
            sum += arr[i];
            if(sum==d) count++;
        }
        System.out.print(count);
    }
}
