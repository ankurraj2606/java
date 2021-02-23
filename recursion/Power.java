package recursion;

class Power {
    static int power(int p, int n) {
        if (n == 1)
            return p;
        else {
            return p * power(p, n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.print(power(5, 4) + " ");
    }
}