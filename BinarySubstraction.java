public class BinarySubstraction {
    public String subtractBinary(String a, String b) {

        StringBuilder result = new StringBuilder();

        int i = a.length() - 1;
        int j = b.length() - 1;
        int borrow = 0;

        while (i >= 0 || j >= 0) {

            int x = (i >= 0) ? a.charAt(i) - '0' : 0;
            int y = (j >= 0) ? b.charAt(j) - '0' : 0;

            int sub = x - y - borrow;

            if (sub < 0) {
                sub += 2;
                borrow = 1;
            } else {
                borrow = 0;
            }

            result.append(sub);

            i--;
            j--;
        }

        result.reverse();

        // Remove leading zeros
        int k = 0;
        while (k < result.length() - 1 && result.charAt(k) == '0') {
            k++;
        }

        return result.substring(k);
    }
    public static void main(String[] args) {
        BinarySubstraction binarySubstraction = new BinarySubstraction();
        String a = "1101"; // Example binary string
        String b = "1010"; // Example binary string

        String difference = binarySubstraction.subtractBinary(a, b);
        System.out.println("Difference of binary strings: " + difference);
    }

}
