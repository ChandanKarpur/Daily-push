public class PlusOneInArray {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] result = new int[digits.length + 1];
        result[0] = 1; 
        
        return result;
    }
    public static void main(String[] args) {
        PlusOneInArray plusOne = new PlusOneInArray();
        int[] digits = {9, 9, 9};
        int[] result = plusOne.plusOne(digits);
        
        System.out.print("Result after adding one: ");
        for (int digit : result) {
            System.out.print(digit);
        }
    }
}
