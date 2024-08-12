import java.util.LinkedList;
import java.util.Queue;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

public class TreeLevelTraversal3 {
    public static boolean printLevel(Node root, int level){
        if(root==null){
            return false;
        }
        if(level==1){
            System.out.print(root.data+" ");
            return true;
        }
        boolean left=printLevel(root.left, level-1);
        boolean right= printLevel(root.right, level-1);
         return (left || right);
    }
    // Time Complexity: O(n^2)
    public static void leverOrderTraversal(Node root){
        int level=1;
        while(printLevel(root, level)){
            level++;
        }
    }

    // level Order traversal by using queue
    // Time Complexity is O(n^2)
    public static void levelTraversalQueue(Node root) {
        Queue<Node> q=new LinkedList<>();
        if(root==null){
            System.out.println("Empty");
            return;
        }
        q.add(root);
        while(!q.isEmpty()){
            System.out.print(q.peek().data+" ");
            if(q.peek().left!=null){
                q.add(q.peek().left);
            }
            if(q.peek().right!=null){
                q.add(q.peek().right);
            }
            q.remove();
        }


    }
    
    public static void main(String[] args) {


        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.left=new Node(8);
        leverOrderTraversal(root);

        System.out.println("--------------------------------");
        
        levelTraversalQueue(root);
    }
}
