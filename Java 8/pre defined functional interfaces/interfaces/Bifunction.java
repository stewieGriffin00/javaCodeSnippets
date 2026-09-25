import java.util.function.BiFunction;

class Main{
  public static void main(String[] args){

    BiFunction<String, Integer, Boolean> biF = (String s, Integer i)-> s.length()==i;
    System.out.println(" length of java is 10: "+biF.apply("java",10)); 
    System.out.println(" length of laughing is 20: "+biF.apply("laughing",20)); 
    System.out.println(" length of computer is 8: "+biF.apply("computer",8)); 
    System.out.println(" length of python is 6: "+biF.apply("python",6)); 
    
  }
}
 
