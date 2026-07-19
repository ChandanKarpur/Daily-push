public class StaticBlockExample {
    public static String name;
    public static final String college;
    public static int id;
    
    static{
        System.out.println("this is a static block");
        name="chandan";
        college="CUTM";
        id=124;
    }
    
    static void student(){
        System.out.println("this is a static method");
    }
    public static void main(String []args){
        System.out.println("this is the main method");
        System.out.println(StaticBlockExample.name+"\n"+StaticBlockExample.college+"\n"+StaticBlockExample.id);
        StaticBlockExample.student();
     }
}
