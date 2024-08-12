import java.util.Arrays;

public class HeapSort5 {

    
    public static int[] heapsort(int []arr){
        int n=arr.length;
        for(int i=(n/2)-1;i>=0;i--){
            heapify(arr,n,i);
        }
        int []ans=new int[n];
        int j=0;
        while(n>0){
            ans[j++]=arr[0];
            arr[0]=arr[n-1];
            heapify(arr, n-1, 0);
            n=n-1;
        }
        return ans;
    }

    public static void heapify(int []arr, int n , int i){
        int largest=i;
        int left=2*i+1;
        int right=2*i+2;
        if(left<n && arr[left]>arr[largest]){
            largest=left;
        }
        if(right<n && arr[right]>arr[largest]){
            largest=right;
        }
        if(largest!=i){
            swap(arr, i, largest);
            heapify(arr, n, largest);
        }
    }
    public static void swap(int []arr, int i, int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int arr[]={4,10,3,5,1,20};
        System.out.println(Arrays.toString(arr));
        int []ans=heapsort(arr);
        System.out.println(Arrays.toString(ans));
        // reverse the array

        for(int i=0;i<ans.length/2;i++){
            int temp=ans[i];
            ans[i]=ans[ans.length-1-i];
            ans[ans.length-1-i]=temp;
        }
        System.out.println(Arrays.toString(ans));
    }
}
