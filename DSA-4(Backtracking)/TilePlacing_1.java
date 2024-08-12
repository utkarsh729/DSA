// given a board of size 2*n and tile of size 2*1, count the number of ways to tile the given board.
public class TilePlacing_1 {
    public static int  totalWays(int n){
        // if(n==0){
        //     return 0;
        // }
        // if(n==1 || n==2){
        //    return n;
        // }
        if(n<=2)
        return n;
        else{
            return totalWays(n-1)+totalWays(n-2);
        }
        
    }
    
    public static void main(String[] args) {
        System.out.println("Total number of ways: "+totalWays(5));
    }
}
