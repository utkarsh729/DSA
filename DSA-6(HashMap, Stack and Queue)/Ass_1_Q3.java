import java.util.*;
public class Ass_1_Q3 {
    public static void main(String[] args) {
        int []arr={1,2,1,3,4,6,4};
        boolean hai=false;
        Map<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])){
                hai=true;
                break;
            }
            else{
                hm.put(arr[i],1);
            }
        }

        if(hai){
            System.out.println("contains duplicate");
        }
        else{
            System.out.println("no duplicates");
        }
    }
}
