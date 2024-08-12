import java.util.*;
public class HashMap_2 {

    public static void main(String[] args) {
        // types of hashmaps

        HashMap<Integer,String> map1=new HashMap<>();
        map1.put(1,"Sahu");
        map1.put(7,"Golu");
        map1.put(5,"Hanu");
        map1.put(3,"Neha");
        map1.put(6,"mariya");

        System.out.println("HashMap is unordered: "+map1);
        System.out.println();

        LinkedHashMap<Integer,String> map2=new LinkedHashMap<>();
        map2.put(1,"Sahu");
        map2.put(7,"Golu");
        map2.put(3,"Neha");
        map2.put(5,"Hanu");
        map2.put(6,"mariya");

        System.out.println("LinkedHashMap is ordered: "+map2);
        System.out.println();

        // Inserting an element in treeMap =O(logn)
        // For n element it is =O(nlogn)
        TreeMap<Integer,String> map3=new TreeMap<>();
        map3.put(1,"Sahu");
        map3.put(7,"Golu");
        map3.put(3,"Neha");
        map3.put(5,"Hanu");
        map3.put(6,"mariya");

        System.out.println("TreeMap is sorted on the basis of key: "+map3);
    }
}
