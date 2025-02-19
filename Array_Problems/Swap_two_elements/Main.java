package Array_Problems.Swap_two_elements;
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int pos1 = 2;
        int pos2 = 6;

        System.out.println("Before swapping");
        for(int i:arr){
            System.out.print(i+" ");
        }

        try{
            int temp = arr[pos1];
            arr[pos1] = arr[pos2];
            arr[pos2] = temp;

            System.out.println("\nAfter Swapping");
            for(int i:arr){
                System.out.print(i+" ");
            }
        }
        catch(Exception e){
            System.out.println("Invalid");
        }
    }
}
