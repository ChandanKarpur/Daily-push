import java.util.Scanner;

public class TemperatureConverter {

    static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;

        do {
            System.out.println("\n===== TEMPERATURE CONVERTER =====");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Celsius to Kelvin");
            System.out.println("4. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter Celsius: ");
                    double celsius = sc.nextDouble();

                    System.out.println(
                        "Fahrenheit = " +
                        celsiusToFahrenheit(celsius)
                    );
                    break;

                case 2:
                    System.out.print("Enter Fahrenheit: ");
                    double fahrenheit = sc.nextDouble();

                    System.out.println(
                        "Celsius = " +
                        fahrenheitToCelsius(fahrenheit)
                    );
                    break;

                case 3:
                    System.out.print("Enter Celsius: ");
                    double temp = sc.nextDouble();

                    System.out.println(
                        "Kelvin = " +
                        celsiusToKelvin(temp)
                    );
                    break;

                case 4:
                    System.out.println("Program ended.");
                    break;

                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);

        sc.close();
    }
}