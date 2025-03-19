import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int arr[][] = new int[rows][cols];

        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        int left = 0, right = cols-1, top = 0, bottom = rows-1;
        
        // 54 spiral matrix leetcode
        while(left<=right && top<=bottom){
            for(int c=left;c<=right;c++){
                System.out.print(arr[top][c]+" ");
            }
            top++;
            if(top>bottom) break;
            for(int r=top;r<=bottom;r++){
                System.out.print(arr[r][right]+" ");
            }
            right--;
            if(left>right) break;
            for(int c=right;c>=left;c--){
                System.out.print(arr[bottom][c]+" ");
            }
            bottom--;
            if(top>bottom) break;
            for(int r=bottom;r>=top;r--){
                System.out.print(arr[r][left]+" ");
            }
            left++;
        }
    }
}
