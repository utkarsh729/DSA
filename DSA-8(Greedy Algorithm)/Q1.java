import java.util.Arrays;
// import java.util.Collections;

public class Q1 {
    public static long solution(long []arr,long n, int low, int high){
        int i=low;
        long pivot=arr[low];
        for(int j=i+1;j<high;j++){
            if(arr[j]<=pivot){
                i=i+1;
                long temp=arr[j];
                arr[j]=pivot;
                pivot=temp;
            }
        }
        long temp=arr[low];
        arr[low]=arr[i];
        arr[i]=temp;
        if(i==n){
           return arr[i];
        }
       else if(i<n){
           return solution(arr,n, i+1, high);
       }
       else{
           return solution(arr,n,low, i-1);
       }
       
        
    }
    public static void main(String[] args) {
        // int k=6;
        int []nums1={-4,-2,0,3};
        int []nums2={2,4};
        int l1=nums1.length;
        int l2=nums2.length;
        long []arr=new long[l1*l2];
        int x=0;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                arr[x++]=nums1[i]*nums2[j];
            }
        }
        System.out.println(Arrays.toString(arr));
        long n=3;
        // Collections.sort()
        long []ar={20,10,30,10,50,90,70,40};
        System.out.println(solution(ar,n,0,arr.length-1));
    }
}
