
package pos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class DBConnection {

    private static final String URL = "jdbc:mysql://localhost:3308/ransalu_db?useSSL=false&serverTimezone=UTC";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = ""; 

    
    public Connection con;

    public DBConnection() {
        try {
            con = getConnection();
        } catch (ClassNotFoundException | SQLException ex) {
            System.getLogger(DBConnection.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

    
    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection(URL, DB_USER, DB_PASSWORD);
    }
}
