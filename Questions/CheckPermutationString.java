import java.util.*;

public class CheckPermutationString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.nextLine();

        String str2 = scn.nextLine();

        char[] charArr1 = str1.toCharArray();
        char[] charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        str1 = new String(charArr1);
        str2 = new String(charArr2);

        if (str1.equals(str2)) {
            System.out.println("They are permutations of each other");
        } else {
            System.out.println("They are not permutations of each other");
        }
    }
}