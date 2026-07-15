package JDBC;
public class Employees {
    private int emp_id;
    private String name;
    private String department;
    private double salary;
    private int hire_year;
   
    public Employees() {
    }

    public int getEmp_id() {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getHire_year() {
        return hire_year;
    }

    public void setHire_year(int hire_year) {
        this.hire_year = hire_year;
    }

    @Override
    public String toString() {
        return "id=" + emp_id +
                ", name='" + name +
                ", department='" + department +
                ", salary=" + salary +
                ", hire_year=" + hire_year ;
    }
}
