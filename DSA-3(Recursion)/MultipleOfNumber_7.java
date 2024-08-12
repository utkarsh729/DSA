import java.util.Scanner;

public class MultipleOfNumber_7 {
    public static void numberMultiple(int num,int k,int idx){
        if(idx>k){
            return;
        }
        System.out.print(num*idx+" ");
        numberMultiple(num, k, idx+1);
        

    }

    // OR

    public static void printMultiple(int num,int k){
        if(k==1){
            System.out.print(num+" ");
            return;
        }
        else{
            printMultiple(num, k-1);
            System.out.print(num*k+" ");
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        System.out.println("enter how many multiple who want: ");
        int k=sc.nextInt();
        numberMultiple(num, k, 1);
        System.out.println();
        printMultiple(num, k);

        sc.close();
    }
}
