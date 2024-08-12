import java.util.*;
public class Queue_9 {
    // space complexity is: o(n)

    // IMPLEMENTATION OF STACK USING QUEUE

    // Time complexity of enqueue operation is: O(1)
    public static void enqueue(int data, Stack<Integer> stack1){
        
        stack1.push(data);
    }

    //Time complexity of dequeue operation is: O(n)
    public static void dequeue( Stack<Integer> stack1, Stack<Integer> stack2){
        if(stack1.empty()){
            System.out.println("underflow");
            return;
        }
        else{
            while(!stack1.empty()){
                stack2.push(stack1.peek());
                stack1.pop();
            }
        }
        System.out.println("the deleted data is: "+stack2.peek());
        stack2.pop();

        while(!stack2.empty()){
            stack1.push(stack2.peek());
            stack2.pop();
        }
    }
    public static void display(Stack<Integer> stack1){
       System.out.println(stack1);
    }
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();

        Stack<Integer> stack2=new Stack<>();

        // insertion 
        enqueue(1, stack1);
        enqueue(2, stack1);
        enqueue(3, stack1);
        enqueue(4, stack1);
        display(stack1);
        dequeue(stack1, stack2);
        display(stack1);

        dequeue(stack1, stack2);
        enqueue(7, stack1);
        display(stack1);
    }
}
