public class Fibonacci_2 {
    public static int fibo(int n){
        if(n==1 || n==2){
            return n-1;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    public static void main(String[] args) {
        int n=9;

        // Time complexity: O(2^n)...exponential time complexity
        // Space complexity: O(n)

        int result=fibo(n);
        System.out.println(result);
    }
}
