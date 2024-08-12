import java.util.Arrays;

public class Q3 {
    public static void merge(int []arr, int []temp, int low,int mid, int high){
        int k=low;
        for(int i=low;i<=mid;i++){
            if(arr[i]<0){
                temp[k++]=arr[i];
            }
        }
        for(int j=mid+1;j<=high;j++){
            if(arr[j]<0){
                temp[k++]=arr[j];
            }
        }
        for(int i=low;i<=mid;i++){
            if(arr[i]>=0){
                temp[k++]=arr[i];
            }
        }
        for(int j=mid+1;j<=high;j++){
            if(arr[j]>=0){
                temp[k++]=arr[j];
            }
        }

        for(int i=low;i<=high;i++){
            arr[i]=temp[i];
        }
        
    }
    public static void divide(int []arr, int []temp, int low, int high){
            if(low>=high){
                return;
            }
            int mid=low+(high-low)/2;
            divide(arr, temp, low, mid);
            divide(arr, temp, mid+1, high);
            merge(arr, temp, low, mid, high);
        
    }
    public static void main(String[] args) {
        int []arr={19,-20,7,-4,-13,11,-5,3};
        int n=arr.length;
        int []temp=new int[n];
        System.out.println(Arrays.toString(arr));
        divide(arr, temp, 0,n-1);
        System.out.println(Arrays.toString(arr));

    }
}
