import java.util.*;

public class practice {
    
    public static void main(String[] args) {
        List<String> words=new ArrayList<>();
        words.add("1");
        words.add("2");
        words.add("prev");
        words.add("prev");
        words.add("prev");
        System.out.println(words);

        ArrayList<String> al=new ArrayList<>();
        ArrayList<Integer> ans =new ArrayList<>();
        for(int i=0;i<words.size();i++){
            if(words.get(i)!="prev"){
                al.add(words.get(i));
            }
            else {
                if(al.size()!=0){
                    ans.add(Integer.valueOf(al.get(al.size()-1)));
                    al.remove(al.size()-1);
                }
                else{
                    ans.add(-1);
                }
            }
        }
        System.out.println(al);
        System.out.println(ans);


        
        
    }
}
