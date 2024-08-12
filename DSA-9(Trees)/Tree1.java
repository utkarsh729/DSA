public class Tree1 {
    TreeNode root;
    class TreeNode{
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode(int data){
            this.data=data;
            left=null;
            right=null;
        }

    }
    public TreeNode addRecursive(TreeNode root,int data){
        if(root==null){
            root=new TreeNode(data);
        }
        else if(data<root.data){
            root.left= addRecursive(root.left, data);
        }
        else{
            root.right= addRecursive(root.right, data);
        }

       return root;
    }
    public  void createTree(int data){
       
        root=addRecursive(root, data);
        
    }

    public void preOrder(TreeNode root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }

    public void postOrder(TreeNode root){
        if(root==null)
            return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
    }
    public static void main(String[] args) {
        Tree1 obj=new Tree1();
        // obj.createTree(1);
        obj.createTree(8);
        obj.createTree(7);
        obj.createTree(12);
        obj.createTree(15);
        obj.createTree(2);
        obj.createTree(5);
        // System.out.println(obj.root.data);
        System.out.println("pre Order ");
        obj.preOrder(obj.root);
        System.out.println("\nIn Order ");
        obj.inOrder(obj.root);
        System.out.println("\nPost Order ");
        obj.postOrder(obj.root);

     
    }
    
}
