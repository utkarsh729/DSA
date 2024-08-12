// Leetcode 33
public class searchInRotatedArray7 {
    public static int binarySearch(int []nums,int low, int high, int target){
        while(low<=high){
            int mid=low+(high-low)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
        return -1;
    }
    public static void main(String[] args) {
        int nums[]={5,1,3};
        int pivot=0;
        int target=5;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                pivot=i;
                break;
            }
        }
        int ans=binarySearch(nums, 0, pivot, target);
        if(ans==-1){
            System.out.println(binarySearch(nums, pivot+1, nums.length-1, target));
        }
        else
        System.out.println(ans);


    }
}
