package bank;
import java.sql.Connection;
import java.sql.DriverManager;

public class DataSource {
  
  public static Connection connect() {
    String db_file = "jdbc:sqlite:resources/bank.db";
    Connection connection = null;

    try {
      connection = DriverManager.getConnection(db_file);
      System.err.println("We're connected");
    } catch (Exception e) {
      e.printStackTrace();
    }
    return connection;
  }

  public static void main(String[] args) {
    connect();
  }
}
