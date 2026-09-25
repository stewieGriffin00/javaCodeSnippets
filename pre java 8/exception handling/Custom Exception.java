// System.out.println();
import java.util.Scanner;
class Database{
    public static void main(String[] args) throws Bike{
      Bike ob1 = new Bike(100,"bik1");
      Bike ob2 = new Bike(200,"bik2");
      Bike[] bikes = {ob1, ob2};
      try{
        bookBike(bikes);
      }
      catch(Bike e){
        // System.out.println(" bike not found "+e.getMessage());
        System.out.println(e.getMessage()+"\n enter the correct bike ");
      }
    }

    public static void bookBike(Bike[] b) throws Bike{
      System.out.println(" enter bike you want ");
      String word = new Scanner(System.in).nextLine();
      for(int i=0; i< b.length; i++){
        if(word.equals(b[i].name)){
          System.out.println(" bike found ");
          return;
        }
        throw new Bike(" throw bike object ");
      }
    }
}

class Bike extends Exception{
  int price;
  String name;
  public Bike(int price, String name){
    this.price = price;
    this.name = name;
  }
  public Bike(){

  }
  public Bike(String str){
    super(str);
  }
  /* public String toString(){
    return " name: "+name+" price: "+price;
  } */
}

