import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDAO dao = new EmployeeDAO();
        Scanner sc = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n===== Employee Database Menu =====");
            System.out.println("1. Add Employee");
            System.out.println("2. View Employees");
            System.out.println("3. Update Employee Salary");
            System.out.println("4. Delete Employee");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.next();
                    System.out.print("Enter department: ");
                    String dept = sc.next();
                    System.out.print("Enter salary: ");
                    double sal = sc.nextDouble();
                    dao.addEmployee(name, dept, sal);
                    break;
                case 2:
                    dao.viewEmployees();
                    break;
                case 3:
                    System.out.print("Enter employee ID: ");
                    int id = sc.nextInt();
                    System.out.print("Enter new salary: ");
                    double newSal = sc.nextDouble();
                    dao.updateEmployee(id, newSal);
                    break;
                case 4:
                    System.out.print("Enter employee ID: ");
                    int delId = sc.nextInt();
                    dao.deleteEmployee(delId);
                    break;
                case 5:
                    System.out.println("👋 Exiting...");
                    break;
                default:
                    System.out.println("❌ Invalid choice!");
            }
        } while (choice != 5);

        sc.close();
    }
}



