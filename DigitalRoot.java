public class DigitalRoot {
    public static int digitalRoot(int n) {
        if(n==0) {
            return 0;
        } else {
            return 1 + (n - 1) % 9;
        }
    }
    public static void main(String[] args) {
        int number = 888; 
        int result = digitalRoot(number);
        System.out.println("The digital root of " + number + " is: " + result);
    }
}
