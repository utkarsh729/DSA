public class Array_2 {
    public static void main(String[] args) {
        int []arr={2,5,7,1,23,1,10};

        int len=arr.length;
        // time complexity O(n)
        // space complexity O(1)
        for(int i=0;i<len/2;i++){
            int temp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=temp;
        }

        for(int i:arr){
            System.out.println(i);
        }
    }
}
