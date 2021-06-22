import java.util.*;

public class TreeTraversals{
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
          
        /// 1

        t.left = new TreeNode(2);
        t.right = new TreeNode(3);

        /* 1
          / \
         2   3
        */

        t.left.left = new TreeNode(4);
        t.left.right = new TreeNode(5);
        
        /* 1
          / \
         2   3
        / \
       4   5
        */

        t.right.left = new TreeNode(6);
        t.right.right = new TreeNode(7);

        /*  1
          /   \
         2     3
        / \   / \
       4   5 6   7
        */
      
      InorderTraversal(t);
      System.out.println();
      PreorderTraversal(t);
      System.out.println();
      PostorderTraversal(t);

        
    }

    public static void InorderTraversal(TreeNode root){
         if(root!=null){
         InorderTraversal(root.left);
         System.out.print(root.data+" ");
         InorderTraversal(root.right);
         }

    }

    public static void PreorderTraversal(TreeNode root){
        if(root!=null){
        System.out.print(root.data+" ");    
        PreorderTraversal(root.left);
        PreorderTraversal(root.right);
        }

   }

   public static void PostorderTraversal(TreeNode root){
    if(root!=null){
    PostorderTraversal(root.left);
    PostorderTraversal(root.right);
    System.out.print(root.data+" ");    
    }

}
}