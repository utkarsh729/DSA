// You are given array in sorted form...you have to find the first occurence(lower bound)of a target

import java.util.*;

public class LowerBound_3 {
    // time complexity: O(logn)
    // space complexity: O(1)
    public static int BinSearch(int []arr, int target){
        int low=0;
        int high=arr.length-1;
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                result=mid;
                // for traversing left side of array
                high=mid-1;
            }
            else if(arr[mid]<target){
                low=low+1;
            }
            else{
                high=mid-1;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int []arr={1,2,7,7,9,9,11};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target=sc.nextInt();

        int occur=BinSearch(arr, target);
        if(occur==-1){
            System.out.println("Not present");
        }
        else{
            System.out.println("Target first occur at index: "+occur);
        }

        sc.close();

    }
}
