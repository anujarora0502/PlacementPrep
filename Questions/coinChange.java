import java.util.*;

public class coinChange{
    public static void main(String[] args) {
     
        int[] S = {25,10,5,1};
       
        int m = 4;
        int n = 50;

        System.out.println(count(S,m,n));

    }

    // public static long count(int S[], int m, int n) 
    // { 
    //     long ans = helper(S,m,n,0);
        
    //     return ans;
    // } 
    
    
    // public static long helper(int[] S, int m, int n, int start){
        
        
    //     if(n<0){
    //         return 0;
    //     }
        
    //     if(n == 0){
    //         return 1;
    //     }
        
        
    //     long result = 0;
        
    //     for(int i = start;i<m;i++){
    //         result += helper(S,m,n-S[i],i);
    //     }
        
    //     return result;
        
    // }


    // Now the bottom up approach 

    public static long count(int S[], int m, int n) 
    { 
        long ans = helper(S,m,n,new long[n+1][S.length]);
        
        return ans;
    } 
    
    
    public static long helper(int[] S, int m, int n,long[][] dp){
        
        
        for(int i = 0;i<=n;i++){
            for(int j = 0;j<m;j++){
             if(i == 0){
                dp[i][j] = 1;
             }else{
                if(i - S[j] >=0){
                    dp[i][j] = dp[i-S[j]][j];
                } 
                
                if(i - S[j] >0){
                    for(int k = 0;k<j;k++){
                        dp[i][j] += dp[i-S[j]][k];
                    }
                }
             }   
            }
        }
    
       long result = 0;    
    
       for(int i = 0;i<m;i++){
         result += dp[n][i];
       } 
       
       
       return result;
            
    }
}