import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class MySQLExample {
    public static void main(String[] args) {
        String jdbcURL = "jdbc:mysql://localhost:3306/your_database";
        String username = "your_username";
        String password = "your_password";

        try (Connection connection = DriverManager.getConnection(jdbcURL, username, password)) {
            System.out.println("Connected to MySQL database");
            
            // Example of executing a query
            String sql = "CREATE TABLE example (id INT PRIMARY KEY, name VARCHAR(50))";
            Statement statement = connection.createStatement();
            statement.execute(sql);

            System.out.println("Table created successfully!");
        } catch (SQLException e) {
            System.out.println("Error connecting to MySQL");
            e.printStackTrace();
        }
    }
}
