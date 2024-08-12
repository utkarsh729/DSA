public class gridPath_11{
    public static void printPath(int cr,int cc,int dr,int dc, String ans){
        if(cr==dr && cc==dc){
            System.out.println(ans);
            return;
        }

        if(cr>dr || cc>dc)
        return;

        printPath(cr+1, cc, dr, dc, ans+'V');
        printPath(cr,cc+1,dr,dc,ans+'H');
    }
    public static void main(String[] args) {
        
        printPath(0, 0, 2, 2, "");
    }         
}