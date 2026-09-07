import java.util.Scanner;
public class RomanToInteger {
    public int romanToInt(String s) {
        int total = 0;
        int length = s.length();
        
        for (int i = 0; i < length; i++) {
            int currentVal = getValue(s.charAt(i));
            
            if (i + 1 < length && currentVal < getValue(s.charAt(i + 1))) {
                total -= currentVal;
            } else {
                total += currentVal;
            }
        }
        return total;
    }
    
    private int getValue(char c) {
        switch (c) {
            case 'I': 
            return 1;
            case 'V': 
            return 5;
            case 'X': 
            return 10;
            case 'L': 
            return 50;
            case 'C': 
            return 100;
            case 'D': 
            return 500;
            case 'M': 
            return 1000;
            default: 
            return 0;
        }
    }
    public static void main(String[] args) {
        RomanToInteger converter = new RomanToInteger();
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a Roman numeral: ");
        String romanNumeral = sc.nextLine();
        
        int integerValue = converter.romanToInt(romanNumeral);
        System.out.println("Integer value: " + integerValue);
        
        sc.close();
    }
}
