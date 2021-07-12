
// Passed on leetcode 


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int data;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int data) { this.data = data; }
 *     TreeNode(int data, TreeNode left, TreeNode right) {
 *         this.data = data;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class checkSubTree {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
       
        return isSubtreeRec(root,subRoot);
        
        
    }
    
    public boolean isSubtreeRec(TreeNode root, TreeNode subRoot){
        if(root == null){
            return false;
        }
        
        boolean leftResult = isSubtreeRec(root.left,subRoot);
        boolean rightResult = isSubtreeRec(root.right,subRoot);
        
        if(leftResult || rightResult ){
            return true;
        }
        
        if(root.data == subRoot.data){
            return checkIfTreesAreEqual(root,subRoot);
        }
        
        return false;
        
        
    }
    
    public boolean checkIfTreesAreEqual(TreeNode node1, TreeNode node2){
        
                
        if(node1 == null&& node2 == null){
            return true;
        }
        
        if(node1 == null || node2 == null){
            return false;
        }
        
        
        if(node1.data != node2.data){
            return false;
        }
        
        boolean leftCheck = checkIfTreesAreEqual(node1.left,node2.left);
        boolean rightCheck = checkIfTreesAreEqual(node1.right,node2.right);
        
        if(!leftCheck||!rightCheck){
            return false;
        }
        return true;
        
    }
}