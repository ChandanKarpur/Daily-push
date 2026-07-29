public class DigitCalculate {
    public static int totalDigits(int n) {
        int temp=0;
        for(int i=1;i<=n;i++){
            int number = i;
            int count =0;

            while(number > 0) {
                number /= 10;
                count++;
            }
            temp += count;
        }
        return temp;
    }
    public static void main(String[] args) {
        int n = 13; 
        int totalDigits = totalDigits(n);
        System.out.println("The total number of digits from 1 to " + n + " is: " + totalDigits);
    }
}
