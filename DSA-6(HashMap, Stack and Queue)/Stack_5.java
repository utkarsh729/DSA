import java.util.*;
public class Stack_5 {
    public static void main(String[] args) {
        Stack<Integer> stack1=new Stack<>();

        stack1.push(2); 
        stack1.push(7); 
        stack1.push(5); 
        stack1.push(9);
        
        System.out.println(stack1.peek());  // display the topmost element 

        stack1.pop();  // delete the element from stack

        System.out.println(stack1.peek());

        // searching in stack
        // searching in stack always start from top element
        System.out.println("the position of 7 is: "+stack1.search(7));
        System.out.println("the position of 2 is: "+stack1.search(2));
        System.out.println("the position of 55 is: "+stack1.search(55));  // if element is not present
        //  then it returns -1

        // empty 
        // it returns true if stack is empty else return false
        System.out.println(stack1.empty());

        stack1.pop();
        stack1.pop();
        stack1.pop();
        // stack1.pop();  --> give error as stack is empty and we are trying to delete

        System.out.println(stack1.empty());

    }
}
