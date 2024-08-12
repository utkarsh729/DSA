import java.util.*;

public class Queue_10 {
    // IMPLEMENTATION OF STACK USING QUEUE

    // Space complexity is: O(n)

    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

    // Time complexity to pusd data is: O(n)
    public static void pushData(int data){
        if(q1.isEmpty()){
            q1.add(data);
            return;
        }
        else{
            while(!q1.isEmpty()){
                q2.add(q1.peek());
                q1.remove();
            }
        }

        q1.add(data);
        
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.remove();
        }
    }

    // Time complexity to pop data is: O(1)
    public static void popData(){
        if(q1.isEmpty()){
            System.out.println("Underflow");
            // System.exit(0);
            return;
        }
        q1.remove();
       
    }

    public static void display(){
        if(q1.isEmpty()){
            System.out.println("empty");
            return;
        }
        System.out.println("The stack is: "+q1);

    }
    public static void main(String[] args) {

        display();
        popData();

        pushData(1);
        pushData(2);
        pushData(3);
        pushData(4);

        display();

        popData();

        display();

        pushData(10);
        pushData(12);

        display();

        popData();
        display();
        popData();
        display();

        popData();
        popData();
        popData();
        display();
        
    }
}
