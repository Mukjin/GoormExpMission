package java_middle.company;


public class Manager extends Employee {
    private String position; // 관리자 직책

    public Manager(String name, double salary, String position) {
        super(name, salary);
        this.position = position;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("관리자 직책: " + position);
    }
}
