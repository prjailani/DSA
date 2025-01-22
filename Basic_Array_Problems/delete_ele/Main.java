public class Main {
    static int[] delete_element(int[] arr, int n,int ele,int pos){
        int[] res = new int[n-1];
        if(pos<0 || pos >n || arr[pos]!=ele){
            System.out.println("Deletion not possible");
            return arr;
        }
        for(int i=0;i<=pos;i++){
            res[i] = arr[i];
        }
        for(int i=pos+1;i<n;i++){
            res[i-1] = arr[i];
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
        for(int i: delete_element(arr, arr.length, 3, 2)){
            System.out.print(i+" ");
        }
    }
}
