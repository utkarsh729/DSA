// package Assignment_1;
import java.util.*;
public class Q2 {
    public static void main(String[] args) {
        int arr[]={3,9,1,6,2};
        for(int i=0;i<arr.length;i++){
            int max_index=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[max_index]<arr[j]){
                    max_index=j;
                }
            }
            if(max_index!=i){
                int temp=arr[i];
                arr[i]=arr[max_index];
                arr[max_index]=temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
