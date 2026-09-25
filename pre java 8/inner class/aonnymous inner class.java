
class Main{
   public static void main(String[] args){   
      E e = new E(){
         @Override
         public void example(){
            System.out.println("exaample method");
         }
      };
      e.example();

      F f = new F(){
         @Override
         void example2(){
            System.out.println("exaample 2 method");
         }
      };
      f.example2();
   }
}

interface E{
   void example();
}

abstract class F{
   abstract void example2();
}