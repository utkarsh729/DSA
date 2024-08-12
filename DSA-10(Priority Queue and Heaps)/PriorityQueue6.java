import java.util.Comparator;
import java.util.PriorityQueue;
public class PriorityQueue6 {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        pq.add(10);
        pq.add(75);
        pq.add(5);
        pq.add(63);
        pq.add(16);

        System.out.println(pq);

        System.out.println(pq.peek());

        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());
        System.out.println(pq.poll());

        System.out.println(pq);

        System.out.println("------------------------------------------");
         
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());

        pq2.add(10);
        pq2.add(1);
        pq2.add(7);
        pq2.add(5);
        pq2.add(3);

        System.out.println(pq2);

        System.out.println(pq2.poll());
        System.out.println(pq2.poll());
        System.out.println(pq2.poll());


        System.out.println("--------------------------------------");

        // Comparator<Integer> com=(Integer a, Integer b)->{
        //     if(b>a){
        //         return 1;
        //     }
        //     else{
        //         return -1;
        //     }
        // };
        
        // PriorityQueue<Integer> pq3=new PriorityQueue<>(com);
        PriorityQueue<Integer> pq3=new PriorityQueue<>((Integer a, Integer b)-> {
            if(a<b){
                return 1;
            }
            else{
                return -1;
            }
        });

        
        pq3.add(10);
        pq3.add(1);
        pq3.add(7);
        pq3.add(5);
        pq3.add(3);

        System.out.println(pq3);

        System.out.println(pq3.poll());
        System.out.println(pq3.poll());
        System.out.println(pq3.poll());
        

        

    }
}
