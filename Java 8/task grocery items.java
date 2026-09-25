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
      Statement statement= connnection.createStatement();

      String query= null;
      query= "Create table if not exists grocery_table(id int primary key auto_increment, item_name varchar(30), price int, quantity int)auto_increment= 1";
      statement.executeUpdate(query); 

      Scanner sc= new Scanner(System.in);
      System.out.println(" menu: \n 1. enter a new item \n 2. display all items \n 3. display all item name \n 4. Update quantity by ID \n 5. delete item by Id \n 6. exit");

      int choice= sc.nextInt();
      String query= null;

      switch(choice){
         case 1: 
            System.out.println("enter Item name");
            String name= sc.next();
            System.out.println("enter Item price");
            int price= sc.nextInt();
            System.out.println("enter Item quantity");
            int quantity= sc.nextInt();
            query= "insert into grocery_table(item_name, price, qunatity) values("+name+","+price+", "+quantity+")";
            statement.executeUpdate(query);
            break;

         case 2: 
            displayItems(statement);
            break;

         case 3:
            viewItemByName(statement);
            break;
         case 4:
            updateQuanity(statement);
            break;
         case 5:
            deleteItem(statement);
            break;
         case 6:
            System.out.println("exit programme");
            return;
            // break;
         default: 
         System.out.println("wrong choice");
      }


      System.out.println("Over");
   }
   void displayItems(Statement statement, ResultSet rs){
      String query= "Select * from grocery_table";
      resultSet= statement.executeQuery(query);
      while(resultSet.next()){
         System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+ resultSet.getInt(4));
      }
   }

   void viewItemByName(Statement statement){
      System.out.println("enter item name");
      String name= new Scanner(System.in).next();
      String query= "Select * from grocery_table where name='"+name+"'";
      ResultSet rSet= statement.executeQuery(query);
      while(rSet.next()){
         System.out.println(resultSet.getInt(1)+" "+resultSet.getString(2)+" "+resultSet.getInt(3)+ resultSet.getInt(4));
      }
   }

   void  updateQuanity(Statement statement){
      displayItems(statement);

      System.out.println("enter the id number to Update");
      int idNumber= new Scanner(System.in).nextInt();

      System.out.println("enter new qunatity to Update");
      int newQuantity= = new Scanner(System.in).nextInt();  

      statement.executeUpdate("update grocery_table set quantity="+ newQuantity+" where id="+idNumber);
   }

   void deleteItem(Statement statement){
      displayItems(statement);

      System.out.println("enter the id number to delete");
      int idNumber= new Scanner(System.in).next();

      statement.executeUpdate("delete grocery_table where id="+idNumber);
      displayItems(statement);
   }

}