//// passed on leetcode question name is subset

import java.util.*;

public class powerSet {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> powerSet = new ArrayList<>();

        powerSet.add(new ArrayList<>());
        
        System.out.println(powerSet);
        
        for(int i = 0;i<nums.length;i++){
            List<List<Integer>> temp = new ArrayList<>();
            
            for(List<Integer> l:powerSet){
                List<Integer> list = new ArrayList<>();
                
                for(Integer x: l){
                    list.add(x);
                }
                
                temp.add(list);
            }
            
            for(List<Integer> l:temp){
                l.add(nums[i]);
            }
            
            for(List<Integer> l:temp){
                powerSet.add(l);
            }
            
            
        }
        
        return powerSet;
    }
}