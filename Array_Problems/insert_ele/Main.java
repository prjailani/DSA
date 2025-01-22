public class Main {
    static int[] insert_element(int[] arr, int n,int ele,int pos){
        int[] res = new int[n+1];
        for(int i=0;i<pos;i++){
            res[i] = arr[i];
        }
        res[pos] = ele;
        for(int i=pos;i<n;i++){
            res[i+1] = arr[i];
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println("Before");
        for(int i:arr){
            System.out.print(i+" ");
        }
        System.out.println("\nAfter");
        for(int i: insert_element(arr, arr.length, 3, 3)){
            System.out.print(i+" ");
        }
    }
}
