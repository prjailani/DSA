import java.util.ArrayList;

public class Main {
    public static void Combinations(int index,int arr[],ArrayList<Integer> temp_arr,ArrayList<ArrayList<Integer>> r_arr, int r){
        if(index==arr.length){
            if(temp_arr.size()==r)
                r_arr.add(new ArrayList<>(temp_arr));
            return;
        }
        if(temp_arr.size()==r) {
            r_arr.add(new ArrayList<>(temp_arr));
            return;
        }
        temp_arr.add(arr[index]);
        Combinations(index+1,arr,temp_arr,r_arr,r);
        temp_arr.remove(temp_arr.size()-1);
        Combinations(index+1, arr, temp_arr, r_arr,r);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3};
        ArrayList<Integer> temp = new ArrayList<>();
        ArrayList<ArrayList<Integer>> l = new ArrayList<>();
        Combinations(0, arr, temp, l, 2);
        for(ArrayList<Integer> i:l)
            System.out.println(i);
    }
}
