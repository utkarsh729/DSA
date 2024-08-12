import java.util.*;
public class Ass_1_Q4{
    public static void main(String[] args) {
        int arr[]={2,5,16,1,8};

        TreeMap<Integer,Integer> hm=new TreeMap<>();

        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],1);
        }
        
        // lastentry() is used to get the last key value pair
        // lastentry().getKey() is used to get the last key
        // or can use lastKey() directly
        System.out.println("The maximum element is: "+hm.lastEntry().getKey());
        System.out.println("The maximum element is: "+hm.lastKey());
        
    }
}
