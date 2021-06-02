// import java.util.*;

// public class UniqueCharString {

//     public static void main(String[] args) {

//         Scanner scn = new Scanner(System.in);

//         String str = scn.nextLine();

//         int flag = 0;

//         for (int i = 0; i < str.length(); i++) {
//                for(int j = i+1;j<str.length();j++){
//                    if(str.charAt(i) == str.charAt(j)){
//                          flag = 1;
//                          break;
//                    }
//                }
//         }

//         if(flag == 1){
//             System.out.println("All characters in the string are not unique");
//         }else{
//             System.out.println("All characters are unique");
//         }

//     }

// }

/////////////////////////HASHSET SOLUTION

import java.util.*;

public class UniqueCharString {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);

        String str = scn.nextLine();

        HashSet<Character> hst = new HashSet<>();

        int flag = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (hst.contains(c)) {
                flag = 1;
                break;
            } else {
                hst.add(str.charAt(i));
            }
        }

        if (flag == 1) {
            System.out.println("All characters in the string are not unique");
        } else {
            System.out.println("All characters are unique");
        }

    }

}

// if it is a-z then it can be done with bit vector like the code below]


// boolean uniqueCharacters(String str)
// {
//     // Assuming string can have characters a-z
//     // this has 32 bits set to 0
//     int checker = 0;

//     for (int i = 0; i < str.length(); i++) {
//         int bitAtIndex = str.charAt(i) - 'a';

//         // if that bit is already set in checker,
//         // return false
//         if ((checker & (1 << bitAtIndex)) > 0)
//             return false;

//         // otherwise update and continue by
//         // setting that bit in the checker
//         checker = checker | (1 << bitAtIndex);
//     }

//     // no duplicates encountered, return true
//     return true;
// }