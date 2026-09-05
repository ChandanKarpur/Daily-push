import java.util.Scanner;

class Student {

    private String name;
    private int totalClasses;
    private int attendedClasses;

    Student(String name, int totalClasses, int attendedClasses) {
        this.name = name;
        this.totalClasses = totalClasses;
        this.attendedClasses = attendedClasses;
    }

    double calculateAttendance() {
        return (attendedClasses * 100.0) / totalClasses;
    }

    void displayResult() {

        double percentage = calculateAttendance();

        System.out.println("\n===== ATTENDANCE DETAILS =====");
        System.out.println("Student Name     : " + name);
        System.out.println("Total Classes    : " + totalClasses);
        System.out.println("Attended Classes : " + attendedClasses);
        System.out.printf("Attendance       : %.2f%%\n", percentage);

        if (percentage >= 75) {
            System.out.println("Status           : Eligible");
        } else {
            System.out.println("Status           : Not Eligible");
        }
    }
}

public class AttendanceSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter total classes: ");
        int total = sc.nextInt();

        System.out.print("Enter attended classes: ");
        int attended = sc.nextInt();

        if (total <= 0 || attended < 0 || attended > total) {
            System.out.println("Invalid attendance details.");
        } else {

            Student student =
                    new Student(name, total, attended);

            student.displayResult();
        }

        sc.close();
    }
}