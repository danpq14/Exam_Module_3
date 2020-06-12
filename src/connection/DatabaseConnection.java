package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
    private static Connection connection;
    private static final String URL = "jdbc:mysql://localhost:3306/product";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "dan224159";

    public DatabaseConnection() {
    }

    public static Connection getConnection() throws ClassNotFoundException, SQLException {

        if (connection == null) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        }
        return connection;
    }

}
