import java.util.Scanner;
public class BinaryToDecimal_8 {
    public static int binToDec(int n){
        int res=0;
        int rem;
        int i=0;
        while(n>0){
            rem=n%10;
            res=res+rem*(int)Math.pow(2,i);
            i++;
            n=n/10;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // System.out.println("Enter the binary number: ");
        // int n=sc.nextInt();
        // int res= binToDec(n);
        // System.out.println("In decimal: "+res);

        int []arr=new int[3];

        if(arr[0]>2&&arr[3]>2){
            System.out.println("jbgj");
        }
        if(arr[0]==0||arr[6]>90){
            System.out.println("jj");
        }
        if(arr[0]==0|arr[34]>4){
            System.out.println("jeogjm");
        }

        sc.close();
    }
}
