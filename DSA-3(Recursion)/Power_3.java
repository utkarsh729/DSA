import java.util.Scanner;

public class Power_3 {
    // Recursive approach--->
    // time complexity: O(b)
    // Space complexity; O(b)
    public static int power(int a,int b){ 
        if(b==1){
           return a;
        }
        else
        return a*power(a,b-1);
    }

    public static long power2(long a, long b){
        long finalResult=0;
        long result=0;
        if(b==1){
            return a;
        }
        else{
            result=power2(a,b/2);
            finalResult=result*result;
            if(b%2==0){
                return finalResult;
            }
            else{
                return a*finalResult;
            }
        }
       
    }
    public static void main(String[] args) {
        long a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a: ");
        a=sc.nextInt();
        System.out.println("Enter b: ");
        b=sc.nextInt();
        // System.out.println(power(a, b));
        System.out.println(power2(a,b));



        // simple approach

        // int pow=1;
        // while(b>0){
        //     pow=pow*a;
        //     b--;
        // }
        // System.out.println(pow);
        sc.close();
    }
}
