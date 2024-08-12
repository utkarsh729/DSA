import java.util.*;

public class HashMap_3 {
    public static void main(String[] args) {
        // Two sum

        // time complexity is : O(n)
        // space complexity is: O(n)

        int []nums={2,7,11,12};

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the target: ");
        int target=sc.nextInt();

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++){
            map.put(nums[i],i);
        }

        int []result=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target && map.containsKey(0)){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
                break;
            }
            else if(map.containsKey(target-nums[i]) && map.get(target-nums[i])>i){
                result[0]=i;
                result[1]=map.get(target-nums[i]);
            }
        }

        if(result[0]==result[1]){
            result[0]=-1;
            result[1]=-1;
        }

        System.out.println(Arrays.toString(result));

        sc.close();
    }
}
