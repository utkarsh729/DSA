// package Assignment;

public class Q3 {
    public static int firstOccur(int []arr){
        int low=0;
        int high=arr.length-1;
        int first=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==1){
                first=mid;
                high=mid-1;
            }
            else if(arr[mid]<1){
                low=mid+1;
            }
            else{
                high=mid-1;
            }

        }
        return first;
    }
    
    public static void main(String[] args) {
        int []arr={0,0,0,0,1,1,1,1};
        int first=firstOccur(arr);
    
       
        System.out.println(arr.length-first);
        
    }
}
