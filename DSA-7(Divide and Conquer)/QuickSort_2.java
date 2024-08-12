import java.util.Arrays;

public class QuickSort_2 {
   
    public static int partition(int []arr, int low, int high){
        // first element as the pivot
        int pivot=arr[low];
        int i=low;
        for(int j=low+1;j<=high;j++){
            if(arr[j]<=pivot){
                i=i+1;
              
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
      
        int temp=arr[i];
        arr[i]=arr[low];
        arr[low]=temp;
        return i;
    }
    public static void quickSort(int []arr,int low, int high){
        if(low<high){
            //1. Divide the problems into subproblems
            int m=partition(arr,low,high);

            //2. Conquer those subproblems via recursion
            quickSort(arr, low, m-1);
            quickSort(arr, m+1, high);

            // 3. No need of combine part
            
        }
    }
    public static void main(String[] args) {
        int arr[]={30,10,60,70,40,20};
        System.out.println(Arrays.toString(arr));
        quickSort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
}
