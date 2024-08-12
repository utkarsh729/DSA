public class practice2 {
    public static int findPeak(int []nums, int low, int high){
        if(low>high){
            return -1;
        }
        int mid=low+(high-low)/2;
        if(mid+1<=high && mid-1>=low  && nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
            return mid;
        }
        else if(nums[mid]<nums[mid+1]){
            return findPeak(nums, mid+1,high);
        }
        else{
            return findPeak(nums,low, mid-1);
        }
    }
    public static void main(String[] args) {
        // int [][]intervals = {{1,3},{2,6},{8,10},{15,18}};
        // for(int interval[]: intervals){
        //     for(int i:interval)
        //     System.out.print(i);
        //     System.out.println();
        // }
        int []nums={1,2,3,1};
        System.out.println(findPeak(nums, 0,nums.length));
    }
}
