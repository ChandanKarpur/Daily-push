public class UniqueDigit {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) 
        return 1;
        
        int totalCount = 10;
        int uniqueDigitsInCurrentLength = 9;
        int availableNumbers = 9;
        
        while (n > 1 && availableNumbers > 0) {
            uniqueDigitsInCurrentLength *= availableNumbers;
            totalCount =totalCount+uniqueDigitsInCurrentLength;
            
            availableNumbers--;
            n--;
        }
        
        return totalCount;
    }
    public static void main(String[] args) {
        UniqueDigit ud = new UniqueDigit();
        int n = 3;
        int result = ud.countNumbersWithUniqueDigits(n);
        System.out.println("The count of numbers with unique digits for n = " + n + " is: " + result);
    }
}
