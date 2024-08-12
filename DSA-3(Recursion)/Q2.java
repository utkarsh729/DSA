import java.util.Scanner;

public class Q2 {
    public static int sumAlternate(int n){
        // int sum=0;
        if(n==0)
        return 0;
        if(n%2==0){
            return -n+sumAlternate(n-1);
            // return sumAlternate(n-1)-n;
        }
        else{
            return n+sumAlternate(n-1);
            // return sumAlternate(n-1)+n;
        }
        
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter n: ");
        n=sc.nextInt();

        System.out.println("Sum is: "+sumAlternate(n));

        sc.close();
    }
}
