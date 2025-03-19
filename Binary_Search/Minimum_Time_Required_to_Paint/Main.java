public class Main{

    //Not correct
    public static boolean isPossible(int[] arr,int a,int b, int threshold){
        int counter = 1;
        int temp_sum = 0;
        int index = 0;
        int n = arr.length;
        while(counter<=a && index<n){
            temp_sum += arr[index];
            if(temp_sum>threshold){
                counter++;
                temp_sum = arr[index];
            }
            index++;
        }

        if(counter<=a)
            return true;
        return false;
    }

    public static void main(String[] args){
        int a = 2;
        int b = 1;

        int[] c = {10,20,30,40};

        int start = 0;
        int end = 0;
        for(int i:c){
            end+=i;
        }

        while(start<end){
            int mid = start + ((end-start)/2);
            if(isPossible(c, a, b, mid))
                end = mid-1;
            else
                start = mid+1;
        }
        System.out.println(start);
    }
}