import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                // Load MySQL JDBC driver
                Class.forName("com.mysql.cj.jdbc.Driver");

                // ✅ Change username/password as per your MySQL setup
                conn = DriverManager.getConnection(
                        "jdbc:mysql://localhost:3306/employee_db",
                        "root",
                        "root"
                );

                System.out.println("✅ Database Connected Successfully!");
            } catch (ClassNotFoundException e) {
                System.out.println("❌ JDBC Driver not found!");
                e.printStackTrace();
            } catch (SQLException e) {
                System.out.println("❌ Database Connection Failed!");
                e.printStackTrace();
            }
        }
        return conn;
    }
}
