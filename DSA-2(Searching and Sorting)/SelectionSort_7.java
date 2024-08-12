import java.util.Arrays;

public class SelectionSort_7 {
    public static void selSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int min_idx=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min_idx]>arr[j])
                min_idx=j;
            }
            if(min_idx!=i){
                int temp=arr[i];
                arr[i]=arr[min_idx];
                arr[min_idx]=temp;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={20,50,10,15,17,25,65};

        // Time complexity: O(n^2)
        // Space complexity: O(1)
        // single swap in every iteration...that is why better then bubble sort
        // At every iteration we get smaller element in the extreme left (at starting)
        System.out.println("Array after selection sort : ");
        selSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
