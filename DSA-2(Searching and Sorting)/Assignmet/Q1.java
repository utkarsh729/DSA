// package Assignmet;

import java.util.*;
public class Q1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size;
        int []arr;
        System.out.println("Enter the number of element you want to add: ");
        size=sc.nextInt();
        arr=new int[size];
        System.out.println("Enter the elements of array: ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int x;
        System.out.println("Enter the elements to be searched in an array: ");
        x=sc.nextInt();
        boolean hai=false;
        for(int i=0;i<size;i++){
            if(arr[i]==x){
                System.out.println(i);
                hai=true;
                break;
            }
        }
        if(!hai){
            System.out.println("Element not found in array");
        }

        sc.close();

    }
}
