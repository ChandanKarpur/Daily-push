public class ModularPower {
    static int power(int a, int b, int m) {
        int result = 1;

        while (b > 0) {

            if (b % 2 == 1) {
                result = (result * a) % m;
            }

            a = (a * a) % m;
            b = b / 2;
        }

        return result;
    }

    public static void main(String[] args) {

        int a = 2;
        int b = 10;
        int m = 1337;

        int answer = power(a, b, m);

        System.out.println("Result = " + answer);
    }
}
