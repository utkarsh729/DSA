public class Q2 {
    public static void main(String[] args) {
        int num=15;
        int i=0;
        while(true){
            int shift=1<<i;
            if(num==shift){
                System.out.println("True");
                break;
            }
            else if(shift>num){
                System.out.println("False");
                break;
            }
            i++;
        }
    }
}
