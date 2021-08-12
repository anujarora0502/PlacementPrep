
// passed on leetcode

import java.util.*;

class permutationWithoutDups {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        helper(nums,new boolean[nums.length],new ArrayList<Integer>(),ans);
        
        return ans;
        
    }
    
    public void helper(int[] nums, boolean[] visited, List<Integer> runningSequence,List<List<Integer>> ans){
    
        if(runningSequence.size() == nums.length){
            List<Integer> temp = new ArrayList<>();
            
            for(int i: runningSequence){
                temp.add(i);
            }
            
            ans.add(temp);
            return;
        }
        
        
        for(int i = 0;i<nums.length;i++){
            if(visited[i] == false){
            visited[i] = true;
            
            runningSequence.add(nums[i]);
            helper(nums,visited,runningSequence,ans);
            runningSequence.remove(runningSequence.size() - 1);
                
            visited[i] = false;
            }
        }
    
}
}