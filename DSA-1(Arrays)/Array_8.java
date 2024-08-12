import java.util.*;
class Approach2{
   
    // Time complexity: O(n^2)
    // Space complexity: O(1)
    public void prefixsum(int[][]arr,int m,int n){

        // Row-wise prefix sum
        for(int i=0;i<m;i++){
            for(int j=1;j<n;j++){
                arr[i][j]=arr[i][j]+arr[i][j-1];
            }
        }
        // Column-wise prefix sum
        for(int j=0;j<n;j++){
            for(int i=1;i<m;i++){
                arr[i][j]=arr[i][j]+arr[i-1][j];
            }
        }
        for(var mat: arr){
            System.out.println(Arrays.toString(mat));
        }
    }


    // Time complexity: O(1)
    // Space complexity: O(1)
    public int sumRegion(int [][]arr,int r1,int c1,int r2,int c2){
        int sum=0,up=0,left=0,repeated_region=0;
        sum=arr[r2][c2];
        up=arr[r1-1][c2];
        left=arr[r2][c1-1];
        repeated_region=arr[r1-1][c1-1];
        int result=sum-up-left+repeated_region;
        return result;
    }
}
public class Array_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n=sc.nextInt();

        int [][]arr=new int[m][n];

        for(int i=0;i<m;i++){
            System.out.println("Enter the elements in row "+i);
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        System.out.println("Enter the r1 coordinate: ");
        int r1=sc.nextInt();
        System.out.println("Enter the c1 coordinate: ");
        int c1=sc.nextInt();
        System.out.println("Enter the r2 coordinate: ");
        int r2=sc.nextInt();
        System.out.println("Enter the c2 coordinate: ");
        int c2=sc.nextInt();

        Approach2 obj=new Approach2();
        obj.prefixsum(arr, m, n);

        System.out.println("The required sum is: "+obj.sumRegion(arr, r1, c1, r2, c2));
        // this is optimized approach...agar bahut saari querry hai toh humko harr baar loop 2 baar chalni hogi..
        // but yaha ak he baar matrix mai change kr diya...ab jitni bhi querry ho ..bass logic change karna hai
        
        sc.close();

    }
}
