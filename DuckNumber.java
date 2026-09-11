public class DuckNumber {
    public static void main(String[] args) {
        int number = 1023; // Example number
        boolean hasZero = false;

        int temp = number;
        while (temp > 0) {
            int digit = temp % 10;
            if (digit == 0) {
                hasZero = true;
                break;
            }
            temp /= 10;
        }

        if (hasZero) {
            System.out.println(number + " is a Duck Number");
        } else {
            System.out.println(number + " is not a Duck Number");
        }
    }
}
