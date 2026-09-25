import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

class Main{
   public static void main(String[] args){
      LocalDateTime localDateTImme = LocalDateTime.now();
      System.out.println(localDateTImme); // prints the date and time

      LocalDate lLocalDate = LocalDate.now();
      System.out.println(lLocalDate); // prints the date only

      LocalTime localTIme = LocalTime.now();
      System.out.println(localTIme); // prints the time only 

      
   }
}

