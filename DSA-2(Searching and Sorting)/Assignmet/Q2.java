// package Assignment;


import java.util.*;
public class Q2 {

    public static void lastOccur(int []arr,int target){
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
        if(last==-1){
            System.out.println("Element not found");
        }
        else{
            System.out.println("Last occurence of target is: "+last);
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int []arr;
        System.out.println("Enter the number of element you want to add: ");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        lastOccur(arr, target);

        sc.close();
    }
}
