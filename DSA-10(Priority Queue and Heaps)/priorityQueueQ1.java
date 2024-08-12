import java.util.*;
public class priorityQueueQ1 {
    public static void main(String[] args) {
        String s="aaab";

        HashMap<Character, Integer> hm=new HashMap<>();
        for(int i=0; i<s.length();i++){
            if(!hm.containsKey(s.charAt(i))){
                hm.put(s.charAt(i), 1);
            }
            else{
                hm.put(s.charAt(i),hm.get(s.charAt(i))+1);
            }
        }
        System.out.println(hm);

        char maxChar='+';
        // char prev='-';
        StringBuilder ans=new StringBuilder();
    
        // for(int i=0;i<s.length();i++){
        //     int maxValue=0;
        //     for(Map.Entry<Character, Integer> en: hm.entrySet()){
        //         if((prev!=en.getKey()) && (en.getValue()> maxValue)){
        //             maxChar=en.getKey();
        //             maxValue=en.getValue();
        //         }
        //     }
        //     ans.append(maxChar);
        //     prev=maxChar;
        //     hm.put(maxChar,maxValue-1);
        // }

        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->(hm.get(b)-hm.get(a)));
        for(Map.Entry<Character, Integer> en: hm.entrySet()){
            pq.add(en.getKey());
        }
        
        while(!pq.isEmpty()){
            if(maxChar!=pq.peek()){
                maxChar=pq.poll();
                ans.append(maxChar);
                
            }
            else{
                char top=pq.poll();
                
                maxChar=pq.poll();
                ans.append(maxChar);
                pq.add(top);
            }

            if(hm.get(maxChar)>1){
                hm.put(maxChar, hm.get(maxChar)-1);
                pq.add(maxChar);
            }
        }

        if(ans.charAt(ans.length()-1)!=ans.charAt(ans.length()-2)){
            System.out.println(ans.toString());
        }
        else{
            System.out.println("");
        }
    }
}
