public class Main {
    static int[] replace_ele(int[] arr, int n){
        int total = 0;
        for(int i:arr){
            total+=i;
        }
        for(int i=0;i<n;i++){
            arr[i] = total-arr[i];
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
        for(int i: replace_ele(arr, arr.length)){
            System.out.print(i+" ");
        }
    }
}
