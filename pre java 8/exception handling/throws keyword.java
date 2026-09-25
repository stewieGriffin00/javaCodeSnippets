// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
      try{
        e1();
      }
      catch(ArithmeticException e){
        System.out.println(e);
      }
    }
    public static void e1() throws ArithmeticException{
        System.out.println(1/0);
    }
}

