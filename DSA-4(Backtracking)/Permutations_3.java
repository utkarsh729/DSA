import java.util.Arrays;
import java.util.Scanner;

public class Permutations_3{
    
    // public static String swap(String str, int i, int j){
    //     char []ch=str.toCharArray();
    //     char temp=ch[i];
    //     ch[i]=ch[j];
    //     ch[j]=temp;
    //     return String.valueOf(ch);
    
    //   }
      
    //   public static void permutation(String str, int left, int right){
    //     if(left==right){
    //       System.out.println(str);
    //     }
    //     else{
    //       for(int i=left;i<=right;i++){
    //         str= swap(str,i,left);
    //         permutation(str, left+1, right);
    
    //         //backtracking
    //         str=swap(str,i,left);
    //       }
    //     }
    //   }


    public static char [] swap(char []ch, int i,int j){
        char temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
        return ch; 
    }
    public static void printPermu(char []ch, int l,int r){
        if(l==r){
            System.out.println(Arrays.toString(ch));
        }
        else{
            for(int i=l;i<=r;i++){
                ch=swap(ch, l, i);
                printPermu(ch, l+1, r);

                // backtracking
                ch=swap(ch, l, i);
            }
        }
        

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str=sc.nextLine();
        char []ch=str.toCharArray();
        printPermu(ch, 0,ch.length-1);
        sc.close();
    }
}