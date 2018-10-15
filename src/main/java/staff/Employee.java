package staff;

public abstract class Employee {

    private String name;
    private String NInumber;
    private double salary;

    public Employee(String name, String NInumber, double salary) {
        this.name = name;
        this.NInumber = NInumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNInumber() {
        return NInumber;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double increment) {
        this.salary += increment;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }

}
