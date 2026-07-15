interface Test{
    void abstractFun(int a);
}
public class LambdaFunctional {
    public static void main(String[] args) {
        Test t=new Test() {
            @Override
            public void abstractFun(int i) {
                System.out.println("The value of i is " + i);
            }
        };
        t.abstractFun(10);
    }
}
