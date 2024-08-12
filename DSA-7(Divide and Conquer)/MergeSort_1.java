import java.util.*;
public class MergeSort_1{
    // low - lower index
    // high - right index
    public static void mergeArray(int []arr, int low, int mid, int high){
        int i,j,k;
        
        // size of array = higher_index- lower_index+1
        int n1=mid-low+1;  // size of left subarray
        int n2=high-mid; // high-(mid+1)+1 = size of right subarray;

        // creating right and left subArray
        int leftSubArray[]=new int[n1];  
        int rightSubArray[]=new int[n2];

        // copying the data into right and left subarray
        for(i=0;i<n1;i++){
            leftSubArray[i]=arr[low+i];
        }
        for(j=0;j<n2;j++){
            rightSubArray[j]=arr[mid+1+j];
        }

        i=0;j=0;
        k=low;
        // comparison between the elements in left and right subarray
        while(i<n1 && j<n2){
            if(leftSubArray[i]<=rightSubArray[j]){
                arr[k++]=leftSubArray[i++];
            }
            else{
                arr[k++]=rightSubArray[j++];
            }
        }

        // copying the remaing element of left and right subarray
        while(i<n1){
            arr[k++]=leftSubArray[i++];
        }
        while(j<n2){
            arr[k++]=rightSubArray[j++];
        }

    }
    public static void mergeSort(int arr[], int low, int high ){
        if(low<high){
            // divide the array into two subproblems
            int mid=low+(high-low)/2;
            // conquer the subproblems using recursion
            // left subarray
            mergeSort(arr, low, mid);
            // right subarray
            mergeSort(arr, mid+1, high);
            // combine the solutions of all subproblems
            mergeArray(arr,low, mid, high);
        }
    }
    public static void main(String[] args) {


        //Recursion relation = 2T(n/2) + n
        // Time complexity = O(nlogn)
        // Space complexity =O(n)
        // Outplace algorithm -> as required extra space


        int []arr={10,50,40,30,20,60};
        int n=arr.length;

        System.out.println("Array before applying merge sort is: "+Arrays.toString(arr));

        mergeSort(arr,0,n-1);

        System.out.println("Array after applying merge sort is: "+Arrays.toString(arr));
    }
}