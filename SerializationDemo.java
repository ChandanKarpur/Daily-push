import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Serializable;

class Dog implements Serializable{
    int i=10;
    int j=20;
}
class Cat implements Serializable{
    int i=30;
    int j=40;
}
public class SerializationDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println("Serialization started");
        FileOutputStream fos = new FileOutputStream("animals.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);
        oos.writeObject(c1);
        System.out.println("Serialization ended");
        System.out.println("Deserialization started");
        FileInputStream fis = new FileInputStream("animals.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog d2 = (Dog) ois.readObject();
        Cat c2 = (Cat) ois.readObject();
        System.out.println("Deserialization ended");
        System.out.println(d2.i+"......."+d2.j);
        System.out.println(c2.i+"......."+c2.j);
    }
}
