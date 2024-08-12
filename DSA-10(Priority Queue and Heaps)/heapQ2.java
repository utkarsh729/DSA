import java.util.PriorityQueue;

public class heapQ2 {
    public static void main(String[] args) {
        int []arr={4,3,2,6};
        int minCost=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int min1=0;
        int min2=0;
        while(!pq.isEmpty()){
            min1=pq.poll();
            if(pq.isEmpty()){
                break;
            }
            min2=pq.poll();
            minCost=minCost+min1+min2;
            pq.add(min1+min2);
            min1=0;
            min2=0;
        }

        System.out.println(minCost);
    }
}
