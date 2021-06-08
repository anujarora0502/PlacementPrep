import java.util.*;  // Nice approach 

public class StringRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        String s1 = scn.nextLine();
        String s2 = scn.nextLine();

        // we need to find if s2 is a rotation of s1
        if(s1.length() != s2.length()){
            System.out.println(false);
        }

        if(isSubstring(s2+s2, s1)){  // i was unable to think by myself
            System.out.println(true);
        }else{
            System.out.println(false);
        }

        scn.close();
    }

    // this function will tell is s2 is substring of s1 or not
    public static boolean isSubstring(String s1, String s2) {

        int lengthOfs1 = s1.length();
        int lengthOfs2 = s2.length();

        if (lengthOfs2 > lengthOfs1) {
            return false;
        } else {
            int start = 0;
            int end = lengthOfs2 - 1;

            while (end < s1.length()) {

                if (s2.equals(s1.substring(start, end + 1))) {
                    return true;
                }

                start++;
                end++;
            }

            return false;
        }

    }
}