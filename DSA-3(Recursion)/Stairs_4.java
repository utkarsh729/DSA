import java.util.Scanner;

public class Stairs_4 {
    public static int noOfWays(int stairs){
        if(stairs==1||stairs==2){
            return stairs;
        }
        else{
            return noOfWays(stairs-1)+noOfWays(stairs-2);
        }
    }

    // OR
    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }

    public static void printPaths(int stairs, int step1, int step2, int start, String path){
        if(start>stairs)
        return;
        if(step1>stairs || step2>stairs)
        return;
        if(start==stairs){
            System.out.println(path);
            return;
        }

        printPaths(stairs, step1+1, step2, start+1, path+1);
        printPaths(stairs, step1, step2+1, start+2, path+2);
    }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int stairs;
        System.out.println("Enter the number of stairs: ");
        stairs=sc.nextInt();
        System.out.println("Total number of ways ..you can climb the stairs: "+noOfWays(stairs));
        System.out.println();
        //OR
        // Reletion between fibonacci series problem and count of stairs problem8
        System.out.println("Total number of ways ..you can climb the stairs: "+fibo(stairs+1));
        System.out.println();

        System.out.println("Paths are: ");
        printPaths(stairs, 0, 0, 0, "");

        sc.close();
    }
}
