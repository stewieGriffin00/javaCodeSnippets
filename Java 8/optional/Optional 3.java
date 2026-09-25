import java.util.Optional;
import java.util.Scanner;

class Main{
   static String name = "Jaffer";
   public static void main(String[] args){
      Optional<String> op1 = name();
      name = op1.orElseGet(()-> getName());
      /*  orELseGet method works like if the op1 has a value it will print it
      if it has null then the implementation inside the lambda function will execute
       */
      System.out.println(name);

   }

   public static Optional<String> name(){
      return Optional.empty();
      // return name;
   }  

   public static String getName(){
      Scanner sc = new Scanner(System.in);
      System.out.println(" name enter ");
      return sc.next();
   }
}