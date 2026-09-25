// method reference
// instance reference
// arbtirary reference
// contructor reference

class Main{
   Main(){
      System.out.println("\t object for Main class is created ");
   }
   static void m1(){
      System.out.println("\t static method, method reference");
   }
   void m2(){
      System.out.println("\t instance method, method reference");
   }

   public static void main(String[] args){
      // static method reference
      A a = Main::m1;
      a.methodA();

      // instance reference
      Main main = new Main();
      B b = main::m2;
      b.methodB();

      // contructor reference
      C c = Main::new;
      c.methodC();

      // arbitrary reference
      D d = String:: length;
      E e1 = String:: isEmpty;
      System.out.println("lenght of \"hello\": "+d.methodD("hello"));
      System.out.println("is empty: "+ e1.methodE("hello"));
   }
}

@FunctionalInterface
interface A{
   void methodA();
}

@FunctionalInterface
interface B{
   void methodB();
}

@FunctionalInterface
interface C{
   void methodC();
}

@FunctionalInterface
interface D{
   int methodD(String k);
}

@FunctionalInterface
interface E{
   boolean methodE(String k);
}
