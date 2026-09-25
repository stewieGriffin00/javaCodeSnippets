import java.util.Optional;

class Main{
   static String name = "Jaffer";
   public static void main(String[] args){
      Optional<String> op1 = Optional.empty();
      System.out.println(op1);
      // M m = new M();
      M m = null;
      Optional<M> op2 = Optional.ofNullable(m);
      // Optional<M> op2 = Optional.empty();
      System.out.println(op2);
      // this will print optional.empty if we pass null into the reference or else if we had not 
      // passed null we would get the value passed into it. 
      // we can pass prmitive as well as non-primitive objects into optional class.
   }
}

class M{
   @Override
   public String toString(){
      return "M class object";
   }
}