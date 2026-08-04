public class nthFibonacciRecursion {
    public int fibonacci(int a,int b,int n) {
        if (n==0) {
            return a;
        }else if(n==1) {
            return b;
        }else {
            return fibonacci(b,a + b,n - 1);
        }
    }

    public static void main(String[] args) {
        int n=7;
        nthFibonacciRecursion obj = new nthFibonacciRecursion();
        int result=obj.fibonacci(0,1,n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }
}
