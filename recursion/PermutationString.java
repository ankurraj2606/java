package recursion;

public class PermutationString {

    // Normal method:o(n)

    // static boolean perStr(String str) {
    // String str1 = "";
    // for (int i = str.length() - 1; i >= 0; i--) {
    // str1 += str.charAt(i);
    // }
    // // System.out.println(str1);
    // if (str.equals(str1))
    // return true;
    // return false;
    // }

    public static void main(String[] args) {
        System.out.println(perStr("racecar"));
    }
}
