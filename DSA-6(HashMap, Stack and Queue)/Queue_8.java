import java.util.*;
public class Queue_8 {
    public static void main(String[] args) {
        Queue<Integer> q=new LinkedList<>();
        // queue is interface in java ..we can implement it by using linkedlist 
        // doubly linked is used behind the scene

        // insertion in queue -- enqueue
        // time complexity for enqueue operation is: O(1)
        for(int i=0;i<10;i++){
            q.add(i);
        }
        System.out.println("the queue is: "+q);
        System.out.println("The size of queue is: "+q.size());

        System.out.println("The topmost element is: "+q.peek());

        // deletion in queue -- dequeue
        // time complexity for dequeue operation is: O(1)
        q.remove();

        System.out.println("The topmost element is: "+q.peek());

        System.out.println("The queue is: " + q);

        // size of queue
        System.out.println("The size of queue is: "+q.size());


    }
}
