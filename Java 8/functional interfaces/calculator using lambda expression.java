class Main{
   public static void main(String[] args){
      Calculator sum = (a,b)-> a+b;
      Calculator sub = (a,b)-> a-b;
      Calculator multiply = (a,b)-> a*b;
      Calculator division = (a,b)-> a/b;

      System.out.println(calculator(10,20, sum));
      System.out.println(calculator(10,20, sub));
      System.out.println(calculator(10,20, multiply));
      System.out.println(calculator(100,20, division));

   }
   static int calculator(int n1, int n2, Calculator c){
      return c.calculate(n1, n2);
   }
}

// this is a functional interface because it has only one abstract method.
interface Calculator{
   int calculate(int a, int b); 
}
