package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    String jdbcUrl = "jdbc:mysql://localhost:3306/demo";
    String userName = "root";
    String password = "talacuanhau14";
    private Connection connection;

    public Connection getConnectionJavaToDB() {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(jdbcUrl, userName, password);
            return connection;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
}
