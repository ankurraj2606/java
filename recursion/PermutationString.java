package recursion;

import java.util.Scanner;

public class PermutationString {

    // Normal method:o(n)

    // static boolean isPalindrome(String str) {
    // String str1 = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // str1 += str.charAt(i);
    // }
    // // System.out.println(str1);
    // if (str.equals(str1))
    // return true;
    // return false;
    // }

    static boolean isPalindrome(String str) {
        if (str == null)
            return true;
        if (str.length() == 0 || str.length() == 1)
            return true;
        String first = str.substring(0, 1);
        String last = str.substring(str.length() - 1, str.length());

        if (!first.equals(last)) {
            return false;
        } else {
            return isPalindrome(str.substring(1, str.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println(isPalindrome(str));
    }
}
