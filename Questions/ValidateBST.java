
// This solution was passed on leetcode question 98 so no need to worry 

public class ValidateBST {
    
    
    public boolean isValidBST(TreeNode root) {
        
        if(root.left == null && root.right == null){
            return true;
        }
      
        return isValidBSTrecursive(root).isValid;
        
    }
    
    public pair isValidBSTrecursive(TreeNode node){
        if(node == null){
            return new pair(Long.MIN_VALUE,Long.MAX_VALUE,true);
        }
        
        pair leftResult = isValidBSTrecursive(node.left);
        pair rightResult = isValidBSTrecursive(node.right);
        
        if(leftResult.isValid == false || rightResult.isValid == false){
            return new pair(Long.MIN_VALUE,Long.MAX_VALUE,false);
        }
        
        if(leftResult.max<node.data&&rightResult.min>node.data){
           long max = Math.max(node.data,Math.max(leftResult.max,rightResult.max));
           long min = Math.min(node.data,Math.min(leftResult.min,rightResult.min));
            return new pair(max,min,true);
        }else{
            return new pair(Long.MIN_VALUE,Long.MAX_VALUE,false);
        }
    }
    
    public class pair{
        long max;
        long min;
        boolean isValid;
        
        pair(long max, long min , boolean isValid){
            this.max = max;
            this.min = min;
            this.isValid = isValid;
        }
    }
}