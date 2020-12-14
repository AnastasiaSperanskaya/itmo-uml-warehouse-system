import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.fabric.jdbc.FabricMySQLDriver;
import com.mysql.jdbc.*;

public class DBManager {
    private static final String URL = "jdbc:mysql://localhost:3306/warehouse?useSSL=false";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "rootroot";

    public static void connectDB() throws SQLException {
        Connection connection;
        Driver driver = new FabricMySQLDriver();
        DriverManager.registerDriver(driver);

    }

    public static void main(String[] args) throws SQLException {

        Connection connection;
        Driver driver = new FabricMySQLDriver();
        DriverManager.registerDriver(driver);

        connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }
}