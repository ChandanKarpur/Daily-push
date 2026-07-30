public class TrailingZeros {
    public static int countTrailingZeros(int n) {
        int count = 0;
        /*for (int i = 5; n / i >= 1; i *= 5) {
            count += n / i;
        }
        return count;*/
        while(n>=5){
            count += n/5;
            n/=5;
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.println(countTrailingZeros(25)); 
    }
}
