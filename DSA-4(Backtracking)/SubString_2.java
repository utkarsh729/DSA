import java.util.ArrayList;

public class SubString_2 {
    public static void subString(int []arr,int idx, ArrayList<Integer> al){
        if(idx==arr.length){
            if(al.size()!=0){
                System.out.println(al);
            }
            return;
        }
        
        subString(arr, idx+1, al);
        // al.add(idx+1);   // if index is 0+1..means 1 is added not object at index 1 is added
        al.add(arr[idx]);
        subString(arr, idx+1, al);
        al.remove(al.size()-1);
    }

    // OR 
    public static void subStrings(int []arr, int idx,String str){
        if(idx==arr.length && !(str.isEmpty())){
          System.out.println(str);
          return;
        }
        if(idx>arr.length-1)
        return;
        subStrings(arr,idx+1,str);
        subStrings(arr,idx+1,str+arr[idx]);
      }
    public static void main(String[] args) {
        int []arr={1,2,3};
        subString(arr,0,new ArrayList<>());


    }
}
