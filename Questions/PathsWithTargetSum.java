
// Path sum III accepted on leetcode great solution 

import java.util.*;

public class PathsWithTargetSum {
    public int pathSum(TreeNode root, int targetSum) {
      
       HashMap<Integer,Integer> map = new HashMap<>();
        
       map.put(0,1);
        
       return pathSumRec(root,0,map,targetSum); 
        
        
        
        
    }
    
    public int pathSumRec(TreeNode root, int currentSum,HashMap<Integer,Integer> map,int targetSum){
        if(root == null){
            return 0;
        }
        
        currentSum += root.data;
        
        int numberOfPaths = map.getOrDefault(currentSum - targetSum,0);
        
        map.put(currentSum,map.getOrDefault(currentSum,0)+1);
        
        int result = pathSumRec(root.left,currentSum,map,targetSum)+pathSumRec(root.right,currentSum,map,targetSum);
        
        map.put(currentSum,map.get(currentSum)-1);
        
        return result+numberOfPaths;
        
        
        
    }
}