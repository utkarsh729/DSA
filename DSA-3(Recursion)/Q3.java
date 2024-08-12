
public class Q3 {
    public static int maxValue(int []arr,int len,int idx){
        if(idx==len-1)
        return arr[len-1];
        else{
            int maxOfLaterIndices=maxValue(arr, len,idx+1);
            int max=Math.max(arr[idx],maxOfLaterIndices);
            return max;    
        }
    }
    public static void main(String[] args) {
        int []arr={13,1,-3,22,5};
        System.out.println("Max value in array is: "+maxValue(arr,arr.length,0));

    }
}
