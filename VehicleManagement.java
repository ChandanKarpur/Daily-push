import java.util.Scanner;

class Vehicle {

    String brand;
    double price;

    Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    void displayVehicle() {
        System.out.println("Brand : " + brand);
        System.out.println("Price : ₹" + price);
    }
}

class Car extends Vehicle {

    int doors;

    Car(String brand, double price, int doors) {
        super(brand, price);
        this.doors = doors;
    }

    void displayCar() {
        System.out.println("\n===== CAR DETAILS =====");
        displayVehicle();
        System.out.println("Doors : " + doors);
    }
}

public class VehicleManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter car brand: ");
        String brand = sc.nextLine();

        System.out.print("Enter car price: ");
        double price = sc.nextDouble();

        System.out.print("Enter number of doors: ");
        int doors = sc.nextInt();

        Car car = new Car(brand, price, doors);

        car.displayCar();

        sc.close();
    }
}
