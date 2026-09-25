class Main{
   public static void main(String[] args){
      Class<?> class1 = Double.class;
      Object  obj1 = 100.78;
      System.out.println(class1.isInstance(obj1)); // true because double inherits number class
      obj1 = 4.2f;
      System.out.println(class1.isInstance(obj1)); // false because float is not double 

      class1 = Number.class;
      obj1 = 4.2f;
      System.out.println(class1.isInstance(obj1)); // true because float inherits number class 
      obj1 = 20.65;
      System.out.println(class1.isInstance(obj1)); // true because Double inherits number class 
      obj1 = 87587587765875875L;
      System.out.println(class1.isInstance(obj1)); // true because Long inherits number class 

   }
}