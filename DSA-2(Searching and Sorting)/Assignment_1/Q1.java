// package Assignment_1;

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        int []arr={3,5,1,6,0};
        for(int i=0;i<arr.length;i++){
            boolean swap=false;
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]<arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap)
            break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
