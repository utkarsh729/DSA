import java.util.Scanner;

public class LinearSearch_1 {
    public static void main(String[] args) {

        // Time complexity: O(n)
        // Space complexity: O(1)
        int []arr={2,39,13,6,7,8};

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number for searching ");
        int num=sc.nextInt();

        boolean hai=false;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==num){
                System.out.println("Element found at position: "+ (i+1));
                hai=true;
                break;
            }
        }
        if(!hai){
            System.out.println("Not found");
        }
        sc.close();
    }
}
