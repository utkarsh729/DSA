import java.util.*;
public class Ass_1_Q5 {
    public static void main(String[] args)  {
        String str1="amba";
        String str2="baadma";

        Map<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str2.length();i++){
            if(hm.containsKey(str2.charAt(i))){
                hm.put(str2.charAt(i),hm.get(str2.charAt(i))+1);
            }
            else
            hm.put(str2.charAt(i),1);
        }

        boolean hai=true;

        for(int i=0;i<str1.length();i++){
            if(hm.containsKey(str1.charAt(i)) && hm.get(str1.charAt(i))!=0){
                hm.put(str1.charAt(i),hm.get(str1.charAt(i))-1);
            }
            else{
                hai=false;
            }
        }
        if(hai){
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
}
