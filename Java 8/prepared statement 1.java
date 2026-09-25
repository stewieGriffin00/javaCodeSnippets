// prepared statement

import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;

class Main{
   public static void main(String[] args){
      String url= "jdbc:mysql://localhost:3306/db3";
      String pass= "1234578";
      String user= "root";

      Connection connnection= DriverManager.getConnection(url, pass, user);
      String query= "update table_jdbc set name= ? where id= ?";
      String name= "new name";
      int id= 100;
      PreparedStatement ps= connnection.prepareStatement(query);
      ps.setString(1, name);
      ps.setInt(2, id);      

      ps.executeUpdate();
   }
}