import java.util.Arrays;

public class Q1 {
    public static void main(String[] args) {
        // int []arr={3,8,6,7,5,9,10};
        // int []arr={3,4,5,6,8,7};
        // int []arr={10,4,6,7,1};
        int []arr={1,6,4,7,10}; 
        int idx1=0;
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                idx1=i;
                break;
            }
        }
        int pivot=arr[idx1];
        int i=idx1;
        for(int j=idx1+1;j<arr.length;j++){
            if(arr[j]<pivot){
                i=i+1;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[idx1];
        arr[idx1]=arr[i];
        arr[i]=temp;
       
        System.out.println(Arrays.toString(arr));
    }
}
