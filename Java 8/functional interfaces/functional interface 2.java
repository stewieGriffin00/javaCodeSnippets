class Main{
   public static void main(String[] args){
      Interface1 i1 = Main:: m1;
      i1.sample(10);

      Interface1 i2 = Main:: m2;;
      i2.sample(10);
   }

   static void m1(int a){
      System.out.println("m1 method is called");
   }
   static int m2(int b){
      System.out.println(" m2 method is called ");
      return 1000;
   }
}

interface Interface1{
   void sample(int a);
}
