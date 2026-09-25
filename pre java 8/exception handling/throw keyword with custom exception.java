// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
      try{
        throw new ArithmeticException(" hello eror occucred ");
      } 
      catch(ArithmeticException a){
        System.out.println(a);
      }
    }
}
