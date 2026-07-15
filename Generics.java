class Test<T> {
    T obj;
    Test(T obj) {
        this.obj=obj;
    }
    public T getObject(){
        return this.obj;
    }
}
public class Generics{
    public static void main(String[] args){
        //instance of integer type
        Test<Integer> iObj=new Test<Integer>(124);
        System.out.println(iObj.getObject());
        //instance of String type
        Test<String> sObj=new Test<String>("Happy Dwali");
        System.out.println(sObj.getObject());
        //iObj=sObj;
    }
}
