// package Assignmet;

import java.util.*;
public class Q5 {
    public static boolean perfectSquare(int num){
        boolean hai =false;
        int low=0;
        int high=num;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(mid*mid==num){
                return true;
            }
            else if(mid*mid<num){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return hai;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        boolean hai=perfectSquare(num);
        System.out.println(hai);
        sc.close();
    }
}
