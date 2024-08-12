import java.util.ArrayList;




class TreeNode{
    int val;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.val=data;
        this.right=null;
        this.left=null;
    }
}

public class LCA {
    ArrayList<TreeNode> a1=new ArrayList<>();
    ArrayList<TreeNode> a2= new ArrayList<>();

     public void inOrder(TreeNode root){
        if(root==null)
            return;
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public void allAncestor(TreeNode root, TreeNode temp, ArrayList<TreeNode> al){
        if(root==null)
        return;
        if(root.val==temp.val){
            al.add(temp);
            return;
        }
        al.add(root);
        allAncestor(root.left,temp,al);
        if(al.contains(temp)){
            return;
        }
        allAncestor(root.right, temp, al);
        if(al.contains(temp)){
            return;
        }
        al.remove(al.size()-1);
    }
  
    public static void main(String[] args) {

        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(5);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(6);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(7);
        root.left.right.right=new TreeNode(4);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(8);

        LCA obj =new LCA();
        obj.inOrder(root);

       
        System.out.println();
        obj.allAncestor(root, root.left, obj.a1);
        obj.allAncestor(root, root.left.right.right, obj.a2);
  

        for(int i=0;i<obj.a1.size();i++){
            System.out.print(obj.a1.get(i).val+" ");
        }
        System.out.println();
        for(int i=0;i<obj.a2.size();i++){
            System.out.print(obj.a2.get(i).val+" ");
        }
    }
}
