public class MethodOverloading {
    int add(int a,int b){
        return a+b;
    }
    double add(double a,double b){
        return a+b;
    }
    String add(String a,String b){
        return a+b;
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();
        System.out.println("integer :"+obj.add(57, 23));
        System.out.println("double :"+obj.add(10.5, 20.5));
        System.out.println("string :"+obj.add("Happy ", "Holi")); 
    }
}
