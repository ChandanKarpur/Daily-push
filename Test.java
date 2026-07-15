class Test {
    void test(int a) throws ArithmeticException {   // using throws
        if(a == 0) {
            throw new ArithmeticException("Division by zero is not allowed");  // using throw
        } else {
            System.out.println("Result: " +(10/a));
        }
    }

    public static void main(String[] args) {
        Test t = new Test();
        try {
            t.test(5);
        } catch(ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }
}
