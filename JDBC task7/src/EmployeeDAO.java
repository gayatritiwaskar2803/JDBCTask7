import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmployeeDAO {
    Connection conn = DBConnection.getConnection();

    // ➕ Add Employee
    public void addEmployee(String name, String dept, double salary) {
        String query = "INSERT INTO employees(name, department, salary) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setString(1, name);
            ps.setString(2, dept);
            ps.setDouble(3, salary);
            ps.executeUpdate();
            System.out.println("✅ Employee Added Successfully!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // 👁 View Employees
    public void viewEmployees() {
        String query = "SELECT * FROM employees";
        try (Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {

            System.out.println("\n🧾 EMPLOYEE LIST");
            System.out.println("----------------------------------");
            System.out.println("ID\tName\tDepartment\tSalary");
            while (rs.next()) {
                System.out.println(rs.getInt("id") + "\t" +
                                   rs.getString("name") + "\t" +
                                   rs.getString("department") + "\t" +
                                   rs.getDouble("salary"));
            }
            System.out.println("----------------------------------\n");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ✏️ Update Employee Salary
    public void updateEmployee(int id, double newSalary) {
        String query = "UPDATE employees SET salary=? WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setDouble(1, newSalary);
            ps.setInt(2, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Employee Updated Successfully!");
            else
                System.out.println("❌ Employee Not Found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // ❌ Delete Employee
    public void deleteEmployee(int id) {
        String query = "DELETE FROM employees WHERE id=?";
        try (PreparedStatement ps = conn.prepareStatement(query)) {
            ps.setInt(1, id);
            int rows = ps.executeUpdate();
            if (rows > 0)
                System.out.println("✅ Employee Deleted Successfully!");
            else
                System.out.println("❌ Employee Not Found!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
