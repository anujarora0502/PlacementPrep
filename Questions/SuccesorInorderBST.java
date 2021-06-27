//this code was tested in gfg so do not worry

public class SuccesorInorderBST{

     // returns the inorder successor of the TreeNode x in BST (rooted at 'root')
	public TreeNode inorderSuccessor(TreeNode root,TreeNode x)
         {
            if(x.right!=null){
                return minInBST(x.right);
            }else{
                return searchSuccesorFromTop(root,x);
            }
         }
         
    public TreeNode minInBST(TreeNode root){         
       
       while(root.left!=null){
           root = root.left;
       }
       
       return root;
        
    }
    
    public TreeNode searchSuccesorFromTop(TreeNode root,TreeNode TreeNode){
        TreeNode succ = null;
        
        while(root!=null){
            if(TreeNode.data < root.data){
                succ = root;
                root = root.left;
            }else if(TreeNode.data>root.data){
                root = root.right;
            }else{
                break;
            }
        }
        
        return succ;
    }
    
}