public class BinarySum {
    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {

            int sum = carry;

            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }

            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }

            result.append(sum % 2);
            carry = sum / 2;
        }

        return result.reverse().toString();
    }
    public static void main(String[] args) {
        BinarySum binarySum = new BinarySum();
        String a = "1010"; // Example binary string
        String b = "1101"; // Example binary string

        String sum = binarySum.addBinary(a, b);
        System.out.println("Sum of binary strings: " + sum);
    }
}
