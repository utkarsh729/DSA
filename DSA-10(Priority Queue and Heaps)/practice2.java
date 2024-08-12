import java.util.*;

public class practice2 {
    public static void main(String[] args) {
        int k=2;
        int [][]points = {{3,3},{5,-1},{-2,4}};
        int [][]ans=new int [k][2];
        int i=0;

        for(int []nums:points){
            ans[i++]=nums;
            nums[0]=0;
            nums[1]=0;
            if(i==2){
                break;
            }
        }
        System.out.println(Arrays.deepToString(ans));
    }
}
