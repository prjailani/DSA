import java.util.ArrayList;

public class Main {
    public static void Subsets(int index,int arr[],ArrayList<Integer> temp_arr,ArrayList<ArrayList<Integer>> r_arr){
        if(index==arr.length){
            r_arr.add(new ArrayList<>(temp_arr));
            return;
        }
        temp_arr.add(arr[index]);
        Subsets(index+1,arr,temp_arr,r_arr);
        temp_arr.remove(temp_arr.size()-1);
        Subsets(index+1, arr, temp_arr, r_arr);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        Subsets(0, arr, temp, l);
        for(ArrayList<Integer> i:l)
            System.out.println(i);
    }
}
