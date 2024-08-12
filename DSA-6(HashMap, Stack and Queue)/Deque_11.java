import java.util.*;
public class Deque_11 {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<>();

        // with the help of deque we can implement both queue and stack at the same time
        // it allow insertion and deletion from both the end

        deque.addLast(1);
        deque.addLast(2);
        deque.addLast(3);

        System.out.println(deque);
        deque.removeFirst();
        System.out.println(deque);

        deque.addFirst(4);
        deque.addFirst(5);
        deque.addFirst(6);
        
        System.out.println(deque);
        deque.remove(2);
        System.out.println(deque); 
        deque.removeLast();
        System.out.println(deque); 

        System.out.println(deque.peek());

        

    }
}
