package virtual_methods;

public class Employee {
    private String name;
    private String address;
    private int number;

    // Constructor
    public Employee(String name, String address, int number) {
        System.out.println("Constructing an Employee");
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public void mailCheck() {
        System.out.println("Mailing a check to " + this.name + " " + this.address);
    }

    public String toString() {
        return this.name + " " + this.address + " " + this.number;
    }

    public String getName() {
        return this.name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String newAddress) {
        this.address = newAddress;
    }

    public int getNumber() {
        return this.number;
    }
}