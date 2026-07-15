package JDBC;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Operation op = new Operation();

        while (true) {
            System.out.println("\n===== EMPLOYEE STOCK MENU =====");
            System.out.println("1. Insert ");
            System.out.println("2. Delete ");
            System.out.println("3. Update ");
            System.out.println("4. Display ");
            System.out.println("5. Login");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    Employees emp = new Employees();

                    System.out.print("Enter emp_id: ");
                    emp.setEmp_id(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter name: ");
                    emp.setName(sc.nextLine());

                    System.out.print("Enter department: ");
                    emp.setDepartment(sc.nextLine());

                    System.out.print("Enter salary: ");
                    emp.setSalary(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Enter hire year: ");
                    emp.setHire_year(sc.nextInt());
                    sc.nextLine();

                    int insertFlag = op.insert(emp);
                    if (insertFlag > 0) {
                        System.out.println("Insert successful");
                    } else {
                        System.out.println("Insert failed");
                    }
                    break;

                case 2:
                    System.out.print("Enter emp_id to delete: ");
                    int empIdDelete = sc.nextInt();

                    int deleteFlag = op.deleteEmployee(empIdDelete);
                    if (deleteFlag > 0) {
                        System.out.println("Delete successful");
                    } else {
                        System.out.println("Delete failed");
                    }
                    break;

                case 3:
                    Employees emp1 = new Employees();
                    System.out.print("Enter emp_id to update: ");
                    emp1.setEmp_id(sc.nextInt());
                    sc.nextLine();

                    System.out.print("Enter new name: ");
                    emp1.setName(sc.nextLine());

                    System.out.print("Enter new department: ");
                    emp1.setDepartment(sc.nextLine());

                    System.out.print("Enter new salary: ");
                    emp1.setSalary(sc.nextDouble());
                    sc.nextLine();

                    System.out.println("Enter new hire year: ");
                    emp1.setHire_year(sc.nextInt());
                    sc.nextLine();

                    int updateFlag = op.update(emp1);
                    if (updateFlag > 0) {
                        System.out.println("Update successful");
                    } else {
                        System.out.println("Update failed");
                    }
                    break;

                case 4:
                    System.out.print("Enter emp_id to display: ");
                    int empIdDisplay = sc.nextInt();

                    op.displayEmployee(empIdDisplay);
                    break;

                case 5:
                    new LoginUI();
                    System.out.print("Enter username: ");
                    String username = sc.nextLine();

                    System.out.print("Enter password: ");
                    String password = sc.nextLine();

                    boolean loginSuccess = op.login(username, password);
                    if (loginSuccess) {
                        System.out.println("Login successful");
                    } else {
                        System.out.println("Login failed");
                    }
                    break;

                case 6:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            } 
        }
    }
}
