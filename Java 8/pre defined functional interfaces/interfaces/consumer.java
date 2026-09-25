import java.util.function.Consumer;

class Main{
   public static void main(String[] args){
     Consumer<String> c = b-> System.out.println(" you passed: "+b);
     // 1. we didn't write the parantheses in function arguments because if there is only one 
     // parameter there is no need of parantheses. 
     // 2.  also we don't need to mention the data type because it is understood. the data type 
     // in the generic of the method declaration is the data type of the parameter
     // we will pass. SO it also not necessary.
     c.accept("ice cream");

   }
}
 
