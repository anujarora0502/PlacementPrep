import java.util.*;

public class RecursiveMultiplication{
    public static void main(String[] args) {
        int x = 6;
        int y = 1;

        if(x<y){
            System.out.println(product(y,x));
        }else{
            System.out.println(product(x,y));
        }
    }

    public static int product(int x, int y){
        
        if(y == 1){
            return x;
        }

        if(y == 0){
            return 0;
        }

        if(y%2 == 0){
           return 2*product(x,y/2);
        }else{
           return 2*product(x, y/2)+x;
        }


    }
}