package recursion;

public class JosephusProblem {
    static int josP(int n, int k) {
        if (n == 1)
            return 0;
        return (josP(n - 1, k) + k) % n;
    }

    public static void main(String[] args) {
        System.out.println(josP(5, 3));
    }
}
// f(n, k) = (f(n-1, k)+k)%n