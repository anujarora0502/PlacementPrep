//passed on leetcode

import java.util.*;

class parens {
    public List<String> generateParenthesis(int n) {
        
        List<String> ans = new ArrayList<>();
        
        helper(n,n,"",ans);
        
        return ans;
        
    }
    
    public void helper(int lp, int rp, String ssf, List<String> ans){
        if(lp == 0&&rp == 0){
            if(validityChecker(ssf)){
              ans.add(new String(ssf));   
            }
            
            return;
        }
        
        if(lp!=0)
        helper(lp - 1,rp,ssf+"(",ans);
        
        if(rp!=0)
        helper(lp,rp-1,ssf+")",ans);    
        
    }
    
    public boolean validityChecker(String str){
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0;i<str.length();i++){
            if(stack.size()!=0){
            if(stack.peek() == '('){
                if(str.charAt(i) == ')'){
                    stack.pop();
                }else{
                    stack.push(str.charAt(i));
                }    
            }}else{
                stack.push(str.charAt(i));
            }
        }
        
        if(stack.size() != 0){
            return false;
        }else{
            return true;
        }   
        
    }
}