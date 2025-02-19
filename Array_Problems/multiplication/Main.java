package Array_Problems.multiplication;
public class Main {
    static int[] Array_multiplication(int[] arr, int n){
        int[] copy = arr.clone();
        for(int i=1;i<n-1;i++){
            arr[i] = copy[i-1]*copy[i+1];
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Before");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nAfter");
        for(int i: Array_multiplication(arr, arr.length)){
            System.out.print(i+" ");
        }
    }
}
