import java.util.*;

public class practice2{
    public static void main(String[] args) {
        String str="aabb";

        Map<Character,Integer> hm=new LinkedHashMap<>();

        for(int i=0;i<str.length();i++){
            if(hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }
        boolean hai=true;
        for(Map.Entry<Character,Integer> e:hm.entrySet()){
            if(e.getValue()==1){
                System.out.println(str.indexOf(e.getKey()));
                hai=false;
                break;
            }
           
        }
        if(hai){
            System.out.println(-1);
        }

       
    }
}