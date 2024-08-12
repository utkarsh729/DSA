import java.util.*;
public class Assignment_2 {
    public static void displayMiddle(int [][]arr,int m,int n){
        for(int i=0;i<m;i++){
            System.out.print(arr[i][n/2] +" ");
        
        }
        for(int j=0;j<n;j++){
            if(j==n/2)
            continue;
            System.out.print(arr[m/2][j] + " ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);


        // Ans 1
        System.out.println("Enter the number of rows: ");
        int m=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int n=sc.nextInt();
        int [][]arr=new int[m][n];
        System.out.println("Enter the elements in an array: ");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        }
        for(var val:arr){
            System.out.println(Arrays.toString(val));
        }
        int zero=0;
        int positive=0;
        int negative=0;
        int odd=0;
        int even=0;
        for(int []i:arr){
            for(int j:i){
                if(j==0)
                zero++;
                if(j>0)
                positive++;
                if(j<0)
                negative++;
                if(j%2==0)
                even++;
                if(j%2!=0)
                odd++;
            }
        }
        System.out.println("Number of zero: "+zero);
        System.out.println("Number of positive numbers: "+positive);
        System.out.println("numbers of negative numbers: "+negative);
        System.out.println("Number of even numbers: "+even);
        System.out.println("Numbers of odd numbers: "+odd);

        System.out.println("\n-------------------------------------------\n");

        // Ans 2

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i+j<m-1)
                System.out.print(arr[i][j]+" ");
            }
        }
    
        System.out.println("\n-------------------------------------------\n");
        
        // Ans 3
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    System.out.print(arr[i][j]+" ");
                }
                else if(i+j==m-1)
                System.out.print(arr[i][j]+" ");
            }
        }
        
        System.out.println("\nOptimised approach");
        for(int i=0;i<m;i++){
            System.out.print(arr[i][i]+" ");
            if(i!=m-1-i){
                System.out.print(arr[i][m-1-i]+" ");
            }
        }
        
        System.out.println("\n-------------------------------------------\n");
        
        // Ans 4
        int max=Integer.MIN_VALUE;
        for(int []i:arr){
            for(int j:i){
                if(j>max){
                    max=j;
                }
            }
        }
        System.out.println("Maximum element in 2D array is: "+max);
        
        System.out.println("\n-------------------------------------------\n");
        
        // Ans 5
        
        displayMiddle(arr,m,n);
        
        System.out.println("\n-------------------------------------------\n");
        
        sc.close();

    }
}
