public class Q5 {
    public static void main(String[] args) {
        int []arr={4, 3, 6, 2, 6, 4, 2, 3, 4, 3, 3,4,3};
        int xor=0;
        for(int i:arr){
            xor=xor^i;
        }
        System.out.println("The odd repeating element is: "+xor);
    }
}
