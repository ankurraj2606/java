package recursion;

public class TraverseNMMatrix {

    static int noOfWays(int m, int n) {
        if (m == 1 || n == 1) {
            return 1;
        }
        return noOfWays(m - 1, n) + noOfWays(m, n - 1);
    }

    public static void main(String[] args) {
        System.out.println(noOfWays(2, 3));
    }
}
