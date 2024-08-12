import java.util.*;
public class HashMap_4 {

    // first non repeating character
    public static void main(String []args){


        StringBuilder str=new StringBuilder("priyaaapr");

        // time complexity is: O(n2)
        // space complexity is: O(1)
        int idx;
        for(int i=0;i<str.length();i++){
            idx=i;
            for(int j=0;j<str.length();j++){
                if(j==i)
                continue;
                if(str.charAt(i)==str.charAt(j)){
                    idx=-1;
                    break;
                }
            }
            if(idx!=-1){
                System.out.println("First non repeating character is at index: "+i);
                break;
            }
        }
        

        // optimized approach
        // Time complexity is O(n)
        // space complexity is O(n)  --> worst as if every character is unique
        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),(hm.get(str.charAt(i))+1));
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }

        System.out.println(hm);

        int result=-1;

        for(int i=0;i<str.length();i++){
            if(hm.get(str.charAt(i))==1){
                result=i;
                break;
            }
        }

        if(result==-1){
            System.out.println("Every character is repeating");
        }
        else{
            System.out.println("Index of first non repeating character is: "+result);
        }
    }
}
