import java.math.BigInteger;
import java.util.Scanner;

public class BigPower_5 {
    public static BigInteger power(BigInteger a, int b){
        if(b==1){
            return a;  // yaha pr hum a return kar rahe hai ..isliye a ko bigInteger declare kiya hai..
            // function ka bhi return type BigInteger hai
        }
        else{
            BigInteger result=power(a,b/2);
            BigInteger finalResult=result.multiply(result);
            if(b%2==0){
                return finalResult;
            }
            else{
                return a.multiply(finalResult);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a and b: ");
        BigInteger a=sc.nextBigInteger();
        int b=sc.nextInt();


        System.out.println("the value of a^b is: "+power(a, b));
        sc.close();
    }
}
