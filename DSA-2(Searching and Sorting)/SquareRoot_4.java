import java.util.*;
public class SquareRoot_4 {

    // Appraoch 1

    // public static int sqRoot(int n){
    //     int result =0;
    //     if(n==0 || n==1){
    //         return n;
    //     }
    //     else{
    //         for(int i=1;i<=n/2;i++){
    //             if(i*i==n){
    //                 result=i;
    //             }
    //             else if(i*i<n){
    //                 result=i;
    //             }
    //         }
    //         return result;
    //     }
    // }

    
    // Approach 2  --> modified binary search...this is more optimised approach

    // Time complexity: O(logn)
    // Space complexity: O(1)

    public static int findSqRoot(int n){
        int low=0;
        int high=n;
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            int val=mid*mid;
            if(val==n){
                return mid;
            }
            else if(val<n){
                result=mid;
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number: ");
        int n=sc.nextInt();

        System.out.println("Square root of number is: "+findSqRoot(n));
        sc.close();
        
    }
}
