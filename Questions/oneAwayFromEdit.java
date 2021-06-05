import java.util.*;

public class oneAwayFromEdit {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String str1 = scn.nextLine();

        String str2 = scn.nextLine();

        if (str1.length() < str2.length()) { // String1 should be always greater in size so
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }

        if (str1.length() - str2.length() > 1) {
            System.out.println(false);
            return;
        }

        int editionsReq = 0;
        int p1 = 0;
        int p2 = 0;

        while (p1 < str1.length() && p2 < str2.length()) {
            if (str1.charAt(p1) != str2.charAt(p2)) {
                editionsReq++;
                if (editionsReq > 1) {
                    break;
                }
                if (str1.length() == str2.length()) {
                    p1++;
                    p2++;
                } else {
                    p1++;
                }
            } else {
                p1++;
                p2++;
            }
        }

        if (editionsReq <= 1) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

    }
}