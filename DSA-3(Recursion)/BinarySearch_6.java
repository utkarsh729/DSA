import java.util.Scanner;

public class BinarySearch_6{
    // time complexity: O(logn)
    // space complexity: O(n)
    public static int Search(int []arr,int low, int high,int target){
        int mid=low+(high-low)/2;
        if(arr[mid]==target){
            return mid;
        }
        else if(low>high){
            return -1;
        }
        else if(arr[mid]<target){
            int index=Search(arr, mid+1, high, target);
            return index;
        }
        else{
            int index=Search(arr, low, mid-1, target);
            return index;
        }
    }
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6,7,80};
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target=sc.nextInt();

        if(Search(arr,0,arr.length-1,target)==-1){
            System.out.println("Target not found");
        }
        else{
            System.out.println("Target found at index: "+Search(arr, 0, arr.length-1, target));
        }

        sc.close();

        
    }
}