package virtual_methods;

public class Virtual_demo {
    public static void main(String[] args) {
        Salary s = new Salary("John Adams", "Boston, MA", 2, 2400.00);
        Employee e = new Salary("George Washington", "Houston, TX", 3, 3000.00);

        System.out.println("Call mailCheck using Salary reference --");
        s.mailCheck();

        System.out.println("\nCall mailCheck using Employee reference --");
        e.mailCheck();
    }
}
