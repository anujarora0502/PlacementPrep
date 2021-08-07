import java.util.*;

public class TowerOfHanoi{
    public static void main(String[] args) {
        int n = 5;

        Stack<Integer> tower1 = new Stack<>();
        Stack<Integer> tower2 = new Stack<>();
        Stack<Integer> tower3 = new Stack<>();

        for(int i = n;i>0;i--){
            tower1.push(i);
        }

        TowerOfHanoi(n,tower1,tower2,tower3);

        System.out.println(tower3);
    }

    public static void TowerOfHanoi(int n,Stack<Integer> tower1,Stack<Integer> tower2,Stack<Integer> tower3){
       
       if(n>0){ 
       TowerOfHanoi(n-1,tower1,tower3,tower2);
       tower3.push(tower1.pop());
       TowerOfHanoi(n-1,tower2,tower1,tower3);
       }
    }

}