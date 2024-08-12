import java.util.*;
public class BinearySearch_2 {
    public static int BinSearch(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                return mid;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        // Time Complexity: O(logn)
        // Space complexity: O(1)
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();

        int []arr=new int[n];

        System.out.println("Enter the elements in array: ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Enter the target element: ");
        int target=sc.nextInt();

        int idx=BinSearch(arr, target);
        if(idx==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index: "+idx);
        }

        sc.close();
        

    }
}
