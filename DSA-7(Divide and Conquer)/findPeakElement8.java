public class findPeakElement8 {
    public static int findPeak(int []nums,int low, int high){
        if (low>high)
        return -1;
        // if(low==high-1){
        // }
        int mid=low+(high-low)/2;
        if(mid<high && mid>low && nums[mid]>=nums[mid-1] && nums[mid]>=nums[mid+1]){
            return mid;
        }
        else if(nums[mid]<nums[mid+1]){
            return findPeak(nums,mid+1,high);
        }
        else{
            return findPeak(nums, low, mid-1);
        }
    }
    public static void main(String[] args) {
        // int []nums={1,2,1,3,5,6,4};
        int[]nums={3,2,1};
        // for(int i=0;i<nums.length;i)
        System.out.println(findPeak(nums, 0, nums.length-1));
    }
}
