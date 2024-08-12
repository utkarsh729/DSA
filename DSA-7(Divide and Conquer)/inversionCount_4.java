import java.util.Arrays;

public class inversionCount_4 {

    // brute force approach or naive approach 
    public static int inversionCnt(int []arr, int n){
        int count=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }
    public static int merge(int []arr, int low, int mid, int high){
        int swap=0;
        int []la=Arrays.copyOfRange(arr, low, mid+1);
        int []ra=Arrays.copyOfRange(arr, mid+1,high+1);
        int i=0,j=0,k=low;

        while(i<la.length&&j<ra.length){
            if(la[i]<=ra[j]){
                arr[k]=la[i];
                i++;
                
            }
            else{
                arr[k]=ra[j++];
                swap=swap+(mid+1)-(low+i);
            }
            k++;
        }
        while(i<la.length){
            arr[k++]=la[i++];
        }
        while(j<ra.length){
            arr[k++]=ra[j++];
        }
        return swap;
    }
    public static int inversionCntDC(int []arr, int low, int high){
        
        int total=0;
        if(low<high){
            int mid=low+(high-low)/2;
            total+=inversionCntDC(arr, low, mid);
            total+=inversionCntDC(arr, mid+1, high);

            total+=merge(arr, low, mid, high);
           

        }
        return total;
    }
    public static void main(String[] args) {

        int []arr={5,4,3,2,1};
        System.out.println(inversionCnt(arr, arr.length));


        // using DC --> divide and conquer
        System.out.println(inversionCntDC(arr, 0, 4));
        
    }
}
