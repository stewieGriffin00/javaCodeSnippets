import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.util.Scanner;

class Main{
   public static void main(String[] args) throws SQLException{
      String password= "12345678";
      String user= "root";
      String url= "jdbc:mysql://localhost:3306/db1";
      Connection connection= DriverManager.getConnection(url, user, password);     
      Scanner sc= new Scanner(System.in);

      String query= null; 
      query= "insert into states values(1, ?, ?)";
      PreparedStatement ps = connection.prepareStatement(query);
      System.out.println(" enter a state name ");
      String name= sc.next();

      System.out.println(" enter a capital name ");
      String capital= sc.next();

      ps.setString(1, name);
      // sc.nextLine();
      ps.setString(2, capital);
      // sc.nextLine();

      ps.executeUpdate();
      System.out.println(" Done!");
   }
}