import java.util.Arrays;

public class Q2 {
    
    public static void partition(int []arr, int low, int high){
        int i=low;
        for(int j=i+1;j<=high;j++){
            if(arr[j]<0){
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
                i=i+1;
            }
        }
    }
    public static void main(String[] args) {
        int []arr={19,-20,7,-4,-13,11,-5,3};
        // int []arr={-20,-30,12,13,-3};
        // int []arr={20,30,-12,-13,-3,3};
        // int []arr={-20,30,-12,13,-3,3};
        // int []arr={20,30,12,46,52,-13,-3,-4};
        partition(arr, 0, 7);
        
        System.out.println(Arrays.toString(arr));
    }
}
