import java.util.ArrayList;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class BST_Q2 {
    Node root;

    public Node insertIntoBST(int data,Node root){
        if(root==null){
            root=new Node(data);
            return root;
        }
        else if(data<=root.data){
            root.left=insertIntoBST(data, root.left);
        }
        else{
            root.right=insertIntoBST(data, root.right);
        }
        return root;
    }

   ArrayList<Integer> al=new ArrayList<>();

    public void inOrder(Node root){
        if(root==null){
            return;
        }
        inOrder(root.left);
        al.add(root.data);
        inOrder(root.right);
    }
    public static void main(String[] args) {
        BST_Q2 obj=new BST_Q2();
        obj.root=obj.insertIntoBST(6,obj.root);
        obj.root=obj.insertIntoBST(4, obj.root);
        obj.root=obj.insertIntoBST(5, obj.root);
        obj.root=obj.insertIntoBST(9, obj.root);
        obj.root=obj.insertIntoBST(8, obj.root);

        obj.inOrder(obj.root);
         System.out.println(obj.al);
        System.out.println("2nd largest is "+obj.al.get(obj.al.size()-2));
    }
}
