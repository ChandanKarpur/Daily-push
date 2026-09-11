public class SpyNumber {
    public static void main(String[] args) {
        int number = 1124; // Example number
        int sum = 0;
        int product = 1;

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            sum += digit;
            product *= digit;
            temp /= 10;
        }

        if (sum == product) {
            System.out.println(number + " is a Spy Number");
        } else {
            System.out.println(number + " is not a Spy Number");
        }
    }
}
