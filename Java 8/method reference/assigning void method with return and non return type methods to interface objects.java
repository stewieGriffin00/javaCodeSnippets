// static method reference
// instance reference
// arbtirary reference
// contructor reference

class Main{
   
   static void m1(){
      System.out.println("\t static method m1, method reference");
   }

   static int m2(){
      System.out.println("\t m2 method invoked ");
      return 1279;
   }
   
   public static void main(String[] args){
      //  method reference
      A a = Main::m1;
      a.methodA();

      A a1 = Main::m2;
      a1.methodA();
      // System.out.println(a1.methodA());
      /*  even though we assigned the return type method to the interface reference object 
         we cannot get an output from it because we aren't calling the class method
         we are invooking the method inside the interface which has void as return type. 
         that is why we cannot invoke these kind of methods inside a return type 
         accepting statements like assigning it to variable and println method.
            Otherwisse it will throw an error.
       */
   }
}

@FunctionalInterface
interface A{
   void methodA();
}

