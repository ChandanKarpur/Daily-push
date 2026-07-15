class Student {
    String name;
    int roll;
    String address;

    void input(String n, int r, String a) {
        name = n;
        roll = r;
        address = a;
    }

    void display() {
        System.out.println("Name: "  +name);
        System.out.println("Roll: "  +roll);
        System.out.println("address:" +address);
    }
}

public class ClassObject {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.input("Chandan Behera", 124, "Berhampur");
        obj.display();
    }
}
