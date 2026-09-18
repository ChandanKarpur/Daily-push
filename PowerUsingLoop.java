public class PowerUsingLoop {
    public static void main(String[] args) {

        int base = 3;
        int exponent = 5;

        int result = 1;

        for (int i = 1; i <= exponent; i++) {
            result = result * base;
        }

        System.out.println("Answer = " + result);
    }
}
