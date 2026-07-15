public class ConstructorType {
    private String name;
    private int age,phno;
    public String address;

    //default constructor
    public ConstructorType(){
        System.out.println("this is default constructor");
    }

    public String getName(){
        return this.name;
    }

    public int getAge(){
        return this.age;
    }

    public int getPhno(){
        return this.phno;
    }

    //parameterised constructor
    public ConstructorType(String name,int age,int phno,String address){
        this.name=name;
        this.age=age;
        this.phno=phno;
        this.address=address;
        System.out.println("this is parameterised constructor");
        System.out.println("name is : "+name+"\nage is : "+age+"\nphone no. is : "+phno+"\naddress is : "+address);
    }
 

    public static void main(String[]args){
        ConstructorType obj1 = new ConstructorType();
        System.out.println("obj1 name: " + obj1.getName());
        ConstructorType obj2 = new ConstructorType("Chandan",21,1234567890,"Bhubaneswar");
        System.out.println("obj2 name: " + obj2.getName());
    }
}
