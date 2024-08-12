import java.util.Arrays;
import java.util.Comparator;

public class Q5 {
    public static void main(String[] args) {
        // int [][]arr={{1,3},{5,7},{2,4},{6,8}};
        
        int [][]arr={{1,3},{7,9},{4,6},{10,13}};
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));
        System.out.println(Arrays.deepToString(arr));
        boolean hai=false;
        for(int i=0;i<arr.length-1;i++){
            if((arr[i][1]>arr[i+1][0]) && (arr[i][1]<arr[i+1][1])){
                System.out.println("intersect");
                hai=true;
                break;
            }
        }
        if(!hai){
            System.out.println("not intersect");
        }
    
    }
}
