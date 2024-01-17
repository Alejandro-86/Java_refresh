package simple_case_study;

public class Employee {

    String name;
    int age;
    String designation;
    double salary;

    // constructor
    public Employee(String name) {
        this.name = name;
    }

    // setters
    public void setAge(int empAge) { age = empAge; }
    public void setDesignation(String empDesig) { designation = empDesig; }
    public void setSalary(double empSalary) { salary = empSalary; }

    // getters
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getDesignation() { return designation; }

    // methods
    public void printEmployee(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }
}
