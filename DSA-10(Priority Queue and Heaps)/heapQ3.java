import java.util.*;

public class heapQ3 {
    public static void main(String[] args) {
        HashMap<String ,Integer> hm=new HashMap<>();

        String []words= {"i","love","leetcode","i","love","coding"};
        // String []words={"the","day","is","sunny","the","the","the","sunny","is","is"};
        int k=1;
        for(int i=0;i<words.length;i++){
            if(hm.containsKey(words[i])){
                hm.put(words[i], hm.get(words[i])+1);
            }
            else{
                hm.put(words[i], 1);
            }
        }

        PriorityQueue<String> pq=new PriorityQueue<>();
        List<String> result=new ArrayList<>();

        int prevFreq=0;
        int n=words.length;
        while(n>0){
            int max=0;
            String ans="";
            for(Map.Entry<String, Integer> en: hm.entrySet()){
                if(en.getValue()>max){
                    max=en.getValue();
                    ans=en.getKey();
                }
            }
            hm.put(ans,0);
            if(max==prevFreq || prevFreq==0){
                pq.add(ans);
            }
            else{
                while(!pq.isEmpty()){
                    result.add(pq.poll());
                }
                pq.add(ans);
            }
            prevFreq=max;
            n--;
        }

        while(!pq.isEmpty()){
            result.add(pq.poll());
        }
        List<String> finalResult=new ArrayList<>();
        for(int i=0;i<k;i++){
            finalResult.add(result.get(i));
        }
        System.out.println(finalResult);
    }
}
