
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

// Time Complexity O(n)
//space complexity O(n)
public class TreeDiameter4 {
    int max=0;

   public int height(Node root){
        if(root==null){
           return 0;
        }

        int left=height(root.left);
        int right=height(root.right);

        int diameter=left+right;
        max=Math.max(max,diameter);

        return 1+Math.max(left,right);
    }
    
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
        root.left.left=new Node(4);
        root.left.right=new Node(5);
        root.right.left=new Node(6);
        root.right.right=new Node(7);
        root.right.right.right=new Node(7);

        TreeDiameter4 obj=new TreeDiameter4();

        obj.height(root);
        
        System.out.println(obj.max);

        
       
       
       
    }
    
}
