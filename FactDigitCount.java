public class FactDigitCount {
    public int factorialDigitCount(int n) {
        long f=1;
        for(int i=1;i<=n;i++){
            f=f*i;
        }
        int count = 0;
        while(f>0){
            f=f/10;
            count++;
        }
        return count;
    }
    public static void main(String[] args) {
        int a = 19;

        int result = new FactDigitCount().factorialDigitCount(a);
        System.out.println("The number of digits in " + a + "! is: " + result);
    }
}
