// Find Duplicate numbers in an array

public class Array_5 {
    public static void main(String[] args) {

        // Time complexity is O(n^2)
        // Space complexity is O(1)
        int []arr={2,3,5,4,3,5,10};
        boolean hai=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                   System.out.println("The duplicate number in an array is: "+arr[i]);
                    hai=true;
                    // break;
                }
            }
        }
        if(!hai){
            System.out.println("No duplicate");
        }
    }
}
