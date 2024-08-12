import java.util.*;

/**
 * practice
 */
public class practice {

    public static void main(String[] args) {
        int [][]points = {{3,3},{5,-1},{-2,4}};
        int k=2;

        ArrayList<Integer> al =new ArrayList<>();

        for(int []nums: points){
            al.add(nums[0]*nums[0]+nums[1]*nums[1]);
        }

        Collections.sort(al);

        System.out.println(al);

        int [][]ans=new int [k][2];
        
        for(int i=0;i<k;i++){
            for(int []nums:points){
                if((nums[0]*nums[0]+nums[1]*nums[1])==al.get(i)){
                    
                    System.out.println(Arrays.deepToString(points));
                    ans[i]=nums;
                    
                    System.out.println(Arrays.toString(ans));
                    nums[0]=0;
                    nums[1]=0;
                    break;
                }
            }
        }

        System.out.println(Arrays.deepToString(ans));
    }
}