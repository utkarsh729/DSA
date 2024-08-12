import java.util.Arrays;

public class InsertionSort_6{
    
    public static void inSort(int []arr){
        for(int i=1;i<arr.length;i++){
            int j=i;
            while(j>0 && arr[j-1]>arr[j]){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
                j--;
            }
        }
    }
   
    public static void main(String[] args) {
        int arr[]={22,19,40,11,27,45};
        // time complexity: O(n^2)
        // space complexity: O(1)
        // Best time complexity: O(n)...when your array is sorted
        // Stable algorithm
        
        System.out.println("Array after insertion sort: ");
        inSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}