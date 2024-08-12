import java.util.Scanner;

public class Tree2 {
    TreeNode root;
    class TreeNode{
        TreeNode right;
        TreeNode left;
        int data;
        TreeNode(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }

    Scanner sc=new Scanner(System.in);
    public  TreeNode createTree(TreeNode root){
        System.out.println("Enter the data: ");
        int data=sc.nextInt();
        root=new TreeNode(data);
        
        if(data==-1){
            return null;
        }
        System.out.println("Enter data at the left of "+root.data);
        root.left=createTree(root.left);
        System.out.println("Enter data at the right of: "+root.data);
        root.right=createTree(root.right);
        
        return root;
        
    }
    public static void main(String[] args) {
        
    }
}
