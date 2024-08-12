import java.util.*;
import java.util.Map.Entry;
public class HashMap_1{
    public static void main(String []str){

        // System.out.println("hello");    --> just trying 
        str=new String[2];
        str[0]="hel";
        System.out.println(str[0]);

        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(1,"Golu");
        hm.put(2,"Utkarsh");
        hm.put(3,"apple");
        hm.put(4,"Google");

        System.out.println("Hashmap is: "+hm);

        System.out.println();

        String name=hm.get(2);
        System.out.println(name);

        String name2=hm.get(5);
        System.out.println(name2);  // --> print null  as key 5 is not present in map

        System.out.println();

        hm.remove(3);
        System.out.println("After removing ..updated hashmap is : "+hm);

        hm.remove(6);
        System.out.println(hm); // nothing will happen as key 6 not present in map

        System.out.println();

        System.out.println(hm.containsKey(2));  // return true if key is present in map else return false
        System.out.println(hm.containsKey(8)); 

        System.out.println(hm.containsValue("Golu"));  // return true if value is present in map else return false
        System.out.println(hm.containsValue("golu"));

        System.out.println();

        for(Entry<Integer,String> e: hm.entrySet()){
            System.out.println("The key is: "+e.getKey()+" value is: "+e.getValue());
        }



    }
}