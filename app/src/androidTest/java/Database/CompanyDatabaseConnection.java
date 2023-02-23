package Database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class CompanyDatabaseConnection {
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/CompanyInfo";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "Firelion3!";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
    }
}
