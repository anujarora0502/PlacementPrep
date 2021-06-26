import java.util.*;

public class MinimalTree{
   public static void main(String[] args) {
       int[] arr = {1,2,3,4,5,6,7,8,9};

       int start = 0;
       int end = arr.length - 1;

       TreeNode root = MinimalTreeRecursive(start,end,arr);

       // code is right accepted on leetcode

   }

   public static TreeNode MinimalTreeRecursive(int start, int end, int[] arr){
        
       if(start>end){
           return null;
       }

       int middle = (start+end)/2;    

       TreeNode node = new TreeNode(arr[middle]);

       node.left = MinimalTreeRecursive(start, middle-1, arr);
       node.right = MinimalTreeRecursive(middle+1,end, arr);

       return node;
   }
}