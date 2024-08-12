import java.util.Scanner;

public class Q4 {
    public static int countSetBits(int n){
        int count=0;
        while(n>0){
            if((n&1)==1)
            count++;
            n=n>>1;
        }
        return count;
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        n=sc.nextInt();

        System.out.println("The number of set bits in the given number are: "+countSetBits(n));
        sc.close();
    }
}
