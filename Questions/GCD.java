import java.util.*;

public class GCD{
    public static void main(String[] args){

       Scanner scn = new Scanner(System.in);

       System.out.println("Enter the values of a & b -  ");

       int a = scn.nextInt();

       int b = scn.nextInt();

       System.out.println("GCD of a and b is "+calcGCD(a,b));

       scn.close();
    }

    public static int calcGCD(int a, int b){
        if(b == 0){
            return a;
        }

        return calcGCD(b,a%b);
    }
}