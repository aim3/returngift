package returngift;

//Step 1: Use interfaces from java.sql package 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCMySQLConnection {
  //static reference to itself
  private static JDBCMySQLConnection instance = new JDBCMySQLConnection();
  public static final String URL = "jdbc:mysql://rgift.heliohost.org:3306/rgift_data";
  public static final String USER = "rgift_user";
  public static final String PASSWORD = "65ytr65yY%t";
  public static final String DRIVER_CLASS = "com.mysql.jdbc.Driver"; 
   
  //private constructor
  private JDBCMySQLConnection() {
      try {
          //Step 2: Load MySQL Java driver
          Class.forName(DRIVER_CLASS);
      } catch (ClassNotFoundException e) {
          e.printStackTrace();
      }
  }
   
  private Connection createConnection() {

      Connection connection = null;
      try {
          //Step 3: Establish Java MySQL connection
          connection = DriverManager.getConnection(URL, USER, PASSWORD);
      } catch (SQLException e) {
    	  System.out.println("Unable to connect to database.");
          e.printStackTrace();
      }
      return connection;
  }   
   
  public static Connection getConnection() {
      return instance.createConnection();
  }
}
