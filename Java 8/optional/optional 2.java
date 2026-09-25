import java.util.Optional;

class Main{
   public static void main(String[] args){

      Optional<String> op1 = Optional.ofNullable("Java");
    //   System.out.println(op1.get());
      System.out.println(op1);

      Optional<String> op2 = Optional.ofNullable(null);
      System.out.println(op2);

      Optional<String> op3 = Optional.ofNullable("class");
      System.out.println(op1.equals(op3));
      System.out.println(op1.equals(op2));
    /* using .get() method to remove the content from optional brackets 
        otherwise it is only inside optional brackets. 
    */
   }
}

