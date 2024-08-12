public class Q4 {
    public static int sumArray(int []arr,int len){
        if(len<0)
        return 0;
        else{
            return arr[len]+sumArray(arr,len-1); 
        }
    
    }
    public static void main(String[] args) {
        int []arr={92,23,15,-20,10};
        System.out.println("Sum of elements in array: "+sumArray(arr,arr.length-1));

    }
}
