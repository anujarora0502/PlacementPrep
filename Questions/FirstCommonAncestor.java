/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        
        pair ans =  numberOfNodesFoundInSubtrees(root,p,q);
        
        return ans.node;
        
    }
    
    public pair numberOfNodesFoundInSubtrees(TreeNode root, TreeNode p, TreeNode q){
        if(root == null){
            return new pair(0,null);
        }
        
        pair leftResult = numberOfNodesFoundInSubtrees(root.left,p,q);
        pair rightResult = numberOfNodesFoundInSubtrees(root.right,p,q);
        
        if(root == p|| root == q){
            if(leftResult.n == 1||rightResult.n == 1){
                return new pair(1,root);
            }
            return new pair(1,null);
        }
        
        if(leftResult.node != null){
            return leftResult;
        }
        
        if(rightResult.node != null){
            return rightResult;
        }
        
        if(leftResult.n == 1 && rightResult.n == 1){
            return new pair(0,root);
        }
        
        
        if(leftResult.n == 1 || rightResult.n == 1){
            return new pair(1,null);
        }
        
        return new pair(0,null);
        
        
    }
    
    public class pair{
        int n;
        TreeNode node;
        
        pair(int n, TreeNode node){
            this.n = n;
            this.node = node;
        }
    }
}