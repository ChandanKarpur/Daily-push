import java.util.Scanner;
public class IntegerToRoman {
    public String IntToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        
        StringBuilder roman = new StringBuilder();
        
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                roman.append(symbols[i]);
                num -= values[i];
            }
        }
        
        return roman.toString();
    }
    public static void main(String[] args) {
        IntegerToRoman converter = new IntegerToRoman();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        
        if (num <= 0) {
            System.out.println("Invalid input. Please enter a positive integer.");
        } else {
            String romanNumeral = converter.IntToRoman(num);
            System.out.println("Roman numeral: " + romanNumeral);
        }
        sc.close();
    }
}