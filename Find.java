class StringExample {
    String name="cutm is in jatni";
    String sub="cutm";
    
}
public class Find{
    public static void main(String[]args){
        StringExample obj = new StringExample();      
        if(obj.name.contains(obj.sub))
        {
            System.out.println("substring is found: ");
        }
        else{
            System.out.println("statement is not found");
        }
        System.out.println("after found substring the statement is");
        System.out.println();
    } 
}
