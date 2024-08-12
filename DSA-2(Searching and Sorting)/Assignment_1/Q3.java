// package Assignment_1;

import java.util.*;

public class Q3 {
    public static void main(String[] args) {
        int arr[]={3,5,1,6,9};

        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j]>arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
