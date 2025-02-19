package Array_Problems.sum_left_side;
public class Main {
    static int[] sum_of_left_side_ele(int[] arr, int n){
        int total = 0;
        for(int i:arr){
            total+=i;
        }
        for(int i=n-1;i>=0;i--){
            total -= arr[i];
            arr[i] = total;
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
        for(int i: sum_of_left_side_ele(arr, arr.length)){
            System.out.print(i+" ");
        }
    }
}
