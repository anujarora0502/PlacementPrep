import java.util.*;

public class flipBitToConvertAtoB{
    public static void main(String[] args) {
        int a = 29;
        int b = 15;

        int xor = a^b;

        int count = 0;

        while(xor!=0){
           xor = xor & xor-1;
           count++;
        }

        System.out.println(count);
    }
}