
// package Assignmet;

import java.util.Scanner;
public class Q4 {
    public static int firstOccur(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                first=mid;
                high=high-1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return first;
    }

    public static int lastOccur(int []arr,int target){
        int low=0;
        int high=arr.length-1;
        int last=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==target){
                last=mid;
                low=mid+1;
            }
            else if(arr[mid]<target){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return last;
    }
    public static void main(String[] args) {
        int []arr={2,5,5,5,6,6,8,9,9,9};
        Scanner sc=new Scanner(System.in);
        int target;
        System.out.println("Enter the target: ");
        target=sc.nextInt();

        int first=firstOccur(arr,target);
        int last=lastOccur(arr,target);

        System.out.println("target "+target+" occurs "+(last-first+1)+" times");
    }
}
    