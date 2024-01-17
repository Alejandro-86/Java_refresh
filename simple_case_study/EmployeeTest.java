package simple_case_study;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("John");
        Employee e2 = new Employee("Mary");
        Employee e3 = new Employee("Bob");
        e1.setAge(30);
        e1.setDesignation("Senior Software Engineer");
        e1.setSalary(100000.00);
        e2.setAge(25);
        e2.setDesignation("Software Engineer");
        e2.setSalary(80000.00);
        e3.setAge(21);
        e3.setDesignation("Junior Software Engineer");
        e3.setSalary(60000.00);
        e1.printEmployee();
        e2.printEmployee();
        e3.printEmployee();
    }
}
