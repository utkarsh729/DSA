public class printBracket_9 {
    public static void printBc(int n,int oc,int cc, String str){
        if((n==oc) && (n==cc)){
            System.out.println(str);
            return;
        }
    
        // if you have fixed no choices then..
        // fixed choice=total number of recursive call 
        // here we have two choice 1. (  2. )

        if(oc<n)
        printBc(n, oc+1, cc, str+'(');
        if(cc<oc)
        printBc(n, oc, cc+1, str+')');
        
    }
    public static void main(String[] args) {
        // problem statement ..print all valid bracket combination for given number n

        printBc(3, 0, 0, "");


    }
}
