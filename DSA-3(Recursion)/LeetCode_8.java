import java.util.*;
public class LeetCode_8 {

    public static boolean searchMatrix(int[][] matrix, int target) {
        int m=matrix.length;
        int i=0;
        while(i<m){
            int n=matrix[i].length;
            int low=0;
            int high=n-1;
            while(low<=high){
                int mid=low+(high-low)/2;
                if(matrix[i][mid]==target)
                return true;
                else if(matrix[i][mid]<target)
                low=mid+1;
                else
                high=mid-1;
            }
            i++;
        }
        return false;
    }

    // this below one fails to search in jagged array
    public static boolean pwSearch(int [][]mat,int target){
        int m=mat.length;
        int n=mat[0].length;
        int low=0;
        int high=m*n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int rowIdx=mid/n;
            int colIdx=mid%n;
            int midEle=mat[rowIdx][colIdx];
            if(midEle==target){
                return true;
            }
            else{
                if(midEle<target){
                    low=mid+1;
                }
                else{
                    high=mid-1;
                }
            }
            
        }
        return false;
    }
    public static void main(String[] args) {
        int [][]mat={{1,3,5,7},
                     {10,11,16,20,22},
                     {23,30,34,60}};
        for(var i:mat){
            System.out.println(Arrays.toString(i));
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the target: ");
        int target=sc.nextInt();
        
        System.out.println(searchMatrix(mat,target));
        System.out.println(pwSearch(mat,target));

        sc.close();
    }
}
