class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }

    // Method Overloading
    void eat() {
        System.out.println("Animal eats food");
    }

    void eat(String food) {
        System.out.println("Animal eats " + food);
    }
}

// Child Class
class Dog extends Animal {

    // Method Overriding
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Main Class
public class MethodOverride {
    public static void main(String[] args) {

        Dog d = new Dog();

        // Method Overriding
        d.sound();

        // Method Overloading
        d.eat();
        d.eat("meat");
    }
}

