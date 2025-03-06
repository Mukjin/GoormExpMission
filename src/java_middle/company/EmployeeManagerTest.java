package java_middle.company;


public class EmployeeManagerTest {
    public static void main(String[] args) {
        Employee emp = new Employee("한호식", 5000000);
        Manager mgr = new Manager("최준형", 8000000, "팀장");

        System.out.println("=== 직원 정보 ===");
        emp.displayInfo();

        System.out.println("\n=== 관리자 정보 ===");
        mgr.displayInfo();
    }
}
