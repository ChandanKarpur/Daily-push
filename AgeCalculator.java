import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class AgeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== AGE CALCULATOR =====");

        System.out.print("Enter birth year: ");
        int year = sc.nextInt();

        System.out.print("Enter birth month: ");
        int month = sc.nextInt();

        System.out.print("Enter birth day: ");
        int day = sc.nextInt();

        try {

            LocalDate birthDate =
                    LocalDate.of(year, month, day);

            LocalDate currentDate =
                    LocalDate.now();

            if (birthDate.isAfter(currentDate)) {
                System.out.println("Birth date cannot be in the future.");
            } else {

                Period age =
                        Period.between(birthDate, currentDate);

                System.out.println("\n===== RESULT =====");
                System.out.println("Birth Date : " + birthDate);
                System.out.println(
                    "Age        : " +
                    age.getYears() + " years, " +
                    age.getMonths() + " months, " +
                    age.getDays() + " days"
                );
            }

        } catch (Exception e) {
            System.out.println("Invalid date entered.");
        }

        sc.close();
    }
}