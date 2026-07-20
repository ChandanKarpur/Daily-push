import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class FileCopy{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("input.txt");
            FileWriter fw = new FileWriter("output.txt");
            int i;
            while((i=fr.read())!= -1){
                fw.write(i);
            }
            fr.close();
            fw.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

