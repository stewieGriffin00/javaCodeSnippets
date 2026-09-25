class Main{
   public static void main(String[] args){
      A a = ()-> {System.out.println(" overrided sample method ");};
      a.sample();

      B b = (int l)-> {System.out.println("\n overrided sample2 method\n is passed  "+ l);};
      b.sample2(100);

      C c = (int m)->{return m+100;}; // we don't need to mention the data type in the prameter
      // because it is already mentioned in the abstract method prantheses so it is optional
      System.out.println(c.sample3(45));

      D d = (int m)->{return (m*2);};
      System.out.println(d.sample3(100));
   }
}

@FunctionalInterface
interface A{
   void sample();
}

@FunctionalInterface
interface B{
   void sample2(int l);
}

@FunctionalInterface
interface C{
   int sample3(int m);
}

@FunctionalInterface
interface D extends C{
   int sample3(int m);
}