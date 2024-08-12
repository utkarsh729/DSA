import java.util.Scanner;

// find sum of rectangle formed with the coordinates entered by the user
public class Array_7 {

    public static int SumRec(int [][]arr,int r1,int c1,int r2,int c2){
        // Approach 1
        int sum=0;
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
                sum+=arr[i][j];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int [][]arr={{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}
                };

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the r1 coordinate: ");
        int r1=sc.nextInt();
        System.out.println("Enter the c1 coordinate: ");
        int c1=sc.nextInt();
        System.out.println("Enter the r2 coordinate: ");
        int r2=sc.nextInt();
        System.out.println("Enter the c2 coordinate: ");
        int c2=sc.nextInt();

        int sum=SumRec(arr, r1, c1, r2, c2);
        System.out.println("Sum is: "+sum);
        sc.close();

    }
}
