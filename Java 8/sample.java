import java.sql.*;

class JoinTables{
   public static void main(String[] args) throws SQLException{
      String url= "jdbc:mysql://localhost:3306/db1";
      String password= "12345678";
      String user= "root";
      String name1= null;
      String name2= null;
      
      Connection connection= DriverManager.getConnection(url, user, password);
      Statement statement= connection.createStatement();
      String query= "create table if not exists table_states(int id, name varchar(30))";
      statement.executeUpdate(query);

      query= "insert into table_states values(1, 'Tamil Nadu'), (2, 'Kerala'), (3, 'Karnataka'), (4, 'Andhra Pradhesh')";
      statement.executeUpdate(query);

      query= "create table if not exists table_capitals(id int, name varchar(30))";
      statement.executeUpdate(query);

      query= "insert into table_capitals values(5, 'Mumbai'), (2, 'Cochin'), (4, 'Hyderabad'), (1, 'Chennai')";
      statement.executeUpdate(query);

      query= "Select * from table_state";
      ResultSet rs1 = statement.executeQuery(query);
      query= "Select * from table_capitals";
      ResultSet rs2 = statement.executeQuery(query);


      System.out.println(" joined table \n"+"    name   "+"    capital    ");
      while(rs1.next()){
         name1= rs1.getString(2);

         while(rs2.next()){
            name2= rs2.getString(2);
            if(name1.equals(name2)){
               System.out.println(name1+"    "+name2);
            }
         }
      }
      System.out.println("\n Done!");
   }
}