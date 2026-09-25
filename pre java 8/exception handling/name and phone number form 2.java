import java.util.Scanner;
class Database{
    static  String name;
    public static void main(String[] args){
      System.out.println(" enter your name: ");
      name = new Scanner(System.in).nextLine();
      pass();
    }

    public static void pass(){
      System.out.println(" enter your number: ");
      int number = 0;
      try{
        number = new Scanner(System.in).nextInt();
        System.out.println(" name: "+name+" \n number: "+number);
        return;
      }
      catch(InputMismatchException e){
        System.out.println(" enter only numbers! ".toUpperCase());
        pass();
      }
    }
}



