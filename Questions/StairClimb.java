import java.util.*;

public class StairClimb{
    public static void main(String[] args) {
        int n = 6;
        
        int[] bottomUp = new int[n+1];
        
        bottomUp[0] = 1;
        bottomUp[1] = 1;
        bottomUp[2] = 2;
        for(int i = 3;i<=n;i++){
            bottomUp[i] = bottomUp[i-1]+bottomUp[i-2]+bottomUp[i-3];
        }
        
        System.out.println(bottomUp[n]);
    }
}