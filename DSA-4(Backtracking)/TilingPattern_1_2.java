public class TilingPattern_1_2 {
    public static void Print(int tile,int n, String str){
        if(tile>n)
        return;
        if(tile==n){
            System.out.println(str);
            return;
        }
        if(tile<=n-2)
        Print(tile+2,n,str+"HH");
        Print(tile+1,n,str+"V");
    }
    public static void main(String[] args) {
        // 2*n ke board mai ..tile place karne ke tarikay...tile size is 2*1;
        // 2=breadth of board and n is length
        // you can place tile either vertical or horizontal..if you are placing 1 tile horizontal then you 
        // have to place another tile horizontal .   this is according to board ..condition may change according
        // to the board size 
        
        Print(0, 5,"");
    }
}
