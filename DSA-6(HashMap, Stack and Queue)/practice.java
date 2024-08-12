class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int []prev_small=new int[n];
        int []next_small=new int [n];

        if(n==1){
            return heights[0];
        }

        for(int i=0;i<n;i++){
            if(i==0){
                prev_small[i]=-1;
                continue;
            }
            for(int j=i-1;j>=0;j--){
                if(heights[j]<heights[i]){
                    prev_small[i]=j;
                    break;
                }
                else{
                    prev_small[i]=-1;
                }
            }
        }

        for(int i=0;i<n;i++){
            if(i==n-1){
                next_small[i]=n;
                break;
            }
            for(int j=i+1;j<n;j++){
                if(heights[j]<heights[i]){
                    next_small[i]=j;
                    break;
                }
                else{
                    next_small[i]=n;
                }
            }
        }

        int  maxArea=0;
        for(int i=0;i<n;i++){
            int width=next_small[i]-prev_small[i]-1;
            int area=width*heights[i];
            if(area>maxArea){
                maxArea=area;
            }
        }

        return maxArea;
        
    }
}
public class practice {
    public static void main(String[] args) {

        Solution obj=new Solution();

        System.out.println(obj.largestRectangleArea(new int[] {0,9}));

    }
}


