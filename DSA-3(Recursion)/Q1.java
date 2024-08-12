import java.util.*;
public class Q1 {
    public static int sumOfDigit(int n){
        // int sum=0;

        if(n==0)
        return 0;
        else{
            // int rem=n%10;
            // sum=rem+sumOfDigit(n/10);
            // return sum;

            return n%10+sumOfDigit(n/10);
        }

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        System.out.println("sum of digit: "+sumOfDigit(n));

        sc.close();
    }
}
