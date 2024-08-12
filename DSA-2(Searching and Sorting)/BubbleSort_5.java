import java.util.*;

public class BubbleSort_5 {
    public static void bubSort(int []arr){
        for(int i=0;i<arr.length;i++){
            
            // for every iteration we get biggest element at the end..so no need to run the second loop till end
            boolean swap=false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swap=true;
                }
            }
            if(!swap){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={3,50,20,2,9};

        // Time complexity: O(n^2)
        // Space complexity: O(1)
        // Best time complexity: O(n)
        // Stable algorithm
        // more swaps
        bubSort(arr);

        System.out.println("Array after applying bubble sort: ");
        
        System.out.println(Arrays.toString(arr));  // first convert to string then print array
    }
}
