import java.util.ArrayList;

public class Main {
    public static void Subsets(int index,int arr[],int sum,ArrayList<Integer> r_arr){
        if(index==arr.length){
            r_arr.add(sum);
            return;
        }
        Subsets(index+1,arr,sum+arr[index],r_arr);
        Subsets(index+1, arr, sum, r_arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> l = new ArrayList<>();
        Subsets(0, arr, 0, l);
        for(int i:l)
            System.out.println(i);
    }
}
