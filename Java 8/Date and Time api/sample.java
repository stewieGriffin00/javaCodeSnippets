import java.util.Optional;

class Main{
   public static void main(String[] args){

      Optional<String> op1 = Optional.ofNullable("Java");
      System.out.println(op1.get());
      
   }
}

