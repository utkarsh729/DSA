import java.util.Scanner;

public class Q5 {

    public static int armstrong(int n){
        if(n==0)
        return 0;
        else{
            return (n%10)*(n%10)*(n%10)+armstrong(n/10);
        }
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        n=sc.nextInt();
        if(n==armstrong(n)){
            System.out.println("It is armstrong");
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
