import java.util.List;
import java.util.Arrays;

class Main{
   public static void main(String[] args){ 
      List<AddressBook> l1= createAddressBook();
      List<User> l2= createUser();

      for (User u: l2) {
          for(AddressBook a: l1){
            if(u.phoneNum== a.phoneNum){
               System.out.println("match");
            }
          }
      }

      
   }

   static List<AddressBook> createAddressBook(){
      AddressBook a1= new AddressBook(1234, "chennai");
      AddressBook a2= new AddressBook(2345, "bangalore");
      AddressBook a3= new AddressBook(3456, "kerala");
      AddressBook a4= new AddressBook(4567, "delhi");
      AddressBook a5= new AddressBook(5678, "mumbai");

      List<AddressBook> l1= Arrays.asList(a1, a2, a3, a4, a5);
      return l1;
   }
   static List<User> createUser(){
      User u1= new User(1, 1234);
      User u2= new User(2, 2345);
      User u3= new User(3, 3456);
      User u4= new User(4, 4567);
      User u5= new User(5, 5678);

      List<User> l2= Arrays.asList(u1,u2,u3,u4, u5);
      return l2;
   }
}

class AddressBook{
   int phoneNum;
   String address;

   AddressBook(int phoneNum, String address){
      this.phoneNum= phoneNum;
      this.address= address;
   }
}

class User{
   int userId;
   int phoneNum;

   User(int userId, int phoneNum){
      this.userId= userId;
      this.phoneNum= phoneNum;
   }
}