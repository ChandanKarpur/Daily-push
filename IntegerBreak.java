public class IntegerBreak {
    public int integerBreak(int n) {
        if (n == 2) return 1;
        if (n == 3) return 2;
        
        int product = 1;
        
        while (n > 4) {
            product *= 3;
            n -= 3;
        }
        
        product *= n;
        
        return product;
    }
    public static void main(String[] args) {
        IntegerBreak ib = new IntegerBreak();
        int n = 10;
        int result = ib.integerBreak(n);
        System.out.println("The maximum product for integer break of " + n + " is: " + result);
    }
}
