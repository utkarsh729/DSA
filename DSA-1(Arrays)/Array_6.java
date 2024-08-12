import java.util.*;

// Rotionation of matrix 
public class Array_6 {
    public static void rotateMatrix(int [][]arr){
        int m=arr.length;
        int n=arr[0].length;

        // Step 1: Transpose of matrix
        for(int i=0;i<m;i++){
            for(int j=i;j<n;j++){
                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        

        // Step 2: Swap last column with first column and so on

        
        for(int i=0;i<m;i++){
            int leftIndex=0;
            int rightIndex=n-1; 
            while(leftIndex<rightIndex){
                int temp=arr[i][leftIndex];
                arr[i][leftIndex]=arr[i][rightIndex];
                arr[i][rightIndex]=temp;
                leftIndex++;
                rightIndex--;
            }
        }


    }
    public static void main(String[] args) {

        // int [][]mat={{1,2,3},{4,5,6},{7,8,9}};

        int [][]mat={ {1,2,3,4},
                      {5,6,7,8},
                      {9,10,11,12},
                      {13,14,15,16}
                    };
       // Time complexity is O(m*n)  and if rows =colums O(n^2)
       // Space complexity is O(1)

        for(int []arr: mat){
            for(int i:arr){
                System.out.print(i+" ");
            }
            System.out.println();
        }
         
        System.out.println("\nMatrix after 90 degree rotation in clockwise is: ");

        // for(int i=0;i<mat.length;i++){
        //     for(int j=mat[i].length-1;j>=0;j--){
        //         System.out.print(mat[j][i]+" ");                
        //     }
        //     System.out.println();
        // }


        // Approach 2 --> pw

        rotateMatrix(mat);

        for(var mtrx:mat){
            System.out.println(Arrays.toString(mtrx));
        }
       



    }
}
