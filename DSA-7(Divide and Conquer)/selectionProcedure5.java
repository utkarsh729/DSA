import java.util.Scanner;

public class selectionProcedure5 {

    public static int partition(int []arr, int low, int high){
        int pivot=arr[low];
        int i=low;
        for(int j=i+1;j<=high;j++){
            if(arr[j]<=pivot){
                i=i+1;
                int temp=arr[j];
                arr[j]=arr[i];
                arr[i]=temp;
            }
        }
        int temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;
        return i;
    }
    public static void quickSort(int []arr,int low, int high,int k){
        if(low<=high){
            int m=partition(arr,low,high);
            if(m==k-1){
                System.out.println(arr[m]);
                return;
            }
            else if(k-1<m){
                quickSort(arr, low, m-1,k);
            }
            else{
                quickSort(arr, m+1, high,k);
            }

            
        }
    }
    public static void main(String[] args) {
        int []arr={20,10,30,10,50,90,70,40};
        // int []arr={3,2,1,5,6,4};
        // int []arr={3,2,3,1,2,4,5,5,6};
        // int n=arr.length-4+1;   // for k largest element
        quickSort(arr, 0, 7, 6);
        
        // brute force
        // int k;
        // Scanner sc=new Scanner(System.in);
        // k=sc.nextInt();
        // int []ar={20,10,30,50,90,70,40};
        // for(int i=0;i<k;i++){
        //     int min_idx=i;
        //     for(int j=i+1;j<ar.length;j++){
        //         if(ar[j]<ar[min_idx]){
        //             min_idx=j;
        //         }
        //     }
        //     int temp=ar[i];
        //     ar[i]=ar[min_idx];
        //     ar[min_idx]=temp;
        // }
        // System.out.println(ar[k-1]);

    }
}
