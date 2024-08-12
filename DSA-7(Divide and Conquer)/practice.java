import java.util.Arrays;

public class practice{
    public static void sortArray(int []nums1, int []nums2, int []merge, int l1, int l2, int h1,int h2){
        if(h1<0 && h2<0){
            return;
        }
        if(l1>h1 && l2>h2 ){
            return;
        }
        int m1=l1+(h1-l1)/2;
        int m2=l2+(h2-l2)/2;
        if(m1>=0 && m2>=0){
            if( nums1[m1]<=nums2[m2]){
                merge[m1+m2]=nums1[m1];
                merge[m1+m2+1]=nums2[m2];
            }
            else{
                merge[m1+m2]=nums2[m2];
                merge[m1+m2+1]=nums1[m1];
            }
        }
        if(m2<0){
            merge[m1]=nums1[m1];
        }
        else if(m1<0){
            merge[m2]=nums[m2];
        }
        sortArray(nums1, nums2, merge, l1, l2, m1-1, m2-1);
        sortArray(nums1, nums2, merge, m1+1,m2+1 , h1, h2);

    }
   public static void main(String[] args) {
    int []nums1={1,3,4,7,10,12};
    int []nums2={2,3,6,15};
    int []merge=new int[nums1.length+nums2.length];
    int l1=0; int l2=0;
    int h1=nums1.length-1,h2=nums2.length;
    sortArray(nums1, nums2, merge, l1, l2, h1, h2);
    System.out.println(Arrays.toString(merge));
   }
}