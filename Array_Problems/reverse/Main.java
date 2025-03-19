package Array_Problems.reverse;
public class Main {
    static int[] arr_reverse(int[] arr, int n){
        int start = 0;
        int end = n-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
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
        for(int i: arr_reverse(arr, arr.length)){
            System.out.print(i+" ");
        }
    }
}
