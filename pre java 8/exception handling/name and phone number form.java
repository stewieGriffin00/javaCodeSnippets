// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args){
      pass();
    }

    public static void pass(){
      System.out.println(" enter your name: ");
      String name;
      name = new Scanner(System.in).nextLine();
      System.out.println(" enter your number: ");
      int number = 0;
      try{
        number = new Scanner(System.in).nextInt();
        System.out.println(" name: "+name+" \n number: "+number);
        return;
      }
      catch(InputMismatchException iME){
        System.out.println(" enter only numbers! ".toUpperCase());
        pass();
      }
    }
}



