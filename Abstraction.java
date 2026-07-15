interface Animal {
    void eat();
    void sleep();
    void makeSound();
}
abstract class Dog implements Animal {
    public void eat() {
        System.out.println("Dog is eating.");
    }
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
class doggerman extends Dog {
    // This class can have additional methods or override existing ones if needed
    public void eat() {
        System.out.println("Dog is eating.");
    }
    public void sleep() {
        System.out.println("Dog is sleeping.");
    }
    public void makeSound() {
        System.out.println("Dog barks.");
    }

}
public class Abstraction {
    public static void main(String[] args) {
        Dog dog = new doggerman();
        dog.eat();
        dog.sleep();
        dog.makeSound();
    }
}
