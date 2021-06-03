import java.util.*;

public class PallindromePermutation { // given a string just check if its permutation is pallindrome or not exclude
                                      // space
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        int[] arr = new int[128];

        for (int i = 0; i < str.length(); i++) {
            int index = 1000;
            if(str.charAt(i)!=' ')
            index = (int) str.charAt(i);
            if (index < 128)
                arr[index]++;
        }

        int singlecharacters = 0;

        for (int i = 0; i < 128; i++) {
            if (arr[i]%2!=0) {
                singlecharacters++;
            }
        }

        if (singlecharacters > 1) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }

    }
}