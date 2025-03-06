package java_middle.company;


public class Employee {
    protected String name;
    protected double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("직원 이름: " + name);
        System.out.println("급여: " + salary);
    }
}
