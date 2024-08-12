public class Factorial_1{

    static int factorial(int n){
        if(n<0){
            System.out.println("negative number");
            return -1;
        }
        if(n==0 || n==1)
        return 1;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        int n=-5;
        int fact;
        // Time complexity: O(n)
        // Space complexity: O(n)
        
        fact=factorial(n);
        System.out.println(fact);
    }
}