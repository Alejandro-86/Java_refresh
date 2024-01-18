package virtual_methods; 

public class Salary extends Employee {
    private double salary;

    public Salary(String name, String address, int number, double salary) {
        super(name, address, number);
        this.setSalary(salary);
    }

    public void mailCheck() {
        System.out.println("Within mailCheck of Salary class");
        System.out.println("Mailing check to " + this.getName() + " with salary " + this.getSalary());
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double newSalary) {
        if (newSalary >= 0.0) {
            this.salary = newSalary;
        }
    }

    public double computePay() {
        System.out.println("Computing salary pay for " + this.getName());
        return this.salary / 52;
    }
}