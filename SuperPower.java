public class SuperPower {
    static final int MOD = 1337;

    public int superPow(int a, int[] b) {
        int result = 1;

        for (int digit : b) {
            result = modPow(result, 10);
            result = (result * modPow(a, digit)) % MOD;
        }

        return result;
    }

    // Calculate base^power % MOD
    private int modPow(int base, int power) {
        int result = 1;
        base = base % MOD;

        while (power > 0) {
            if (power % 2 == 1) {
                result = (result * base) % MOD;
            }

            base = (base * base) % MOD;
            power /= 2;
        }

        return result;
    }
    public static void main(String[] args) {
        SuperPower sp = new SuperPower();
        int a = 2;
        int[] b = {1, 0};
        int result = sp.superPow(a, b);
        System.out.println("Result: " + result);
    }
}
