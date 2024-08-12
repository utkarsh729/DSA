public class Q1 {
    public static void main(String[] args) {
        int num=12;
        int rem;
        int binary=0;
        int i=0;
        while(num>0){
            rem=num%2;
            binary=binary+rem*(int)Math.pow(10,i);
            i++;
            num=num/2;
        }
        System.out.println(binary);
    }
}
