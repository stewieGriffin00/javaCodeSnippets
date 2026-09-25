class Main{
   public static void main(String[] args){
        Class<?> class1 = String.class;
        Object obj1 = "hello world"; 
        System.out.println(class1.isInstance(obj1)); // true because it is string
        obj1 = 100;
        System.out.println(class1.isInstance(obj1)); // false because it is integer 
        obj1 = 'c'; 
        System.out.println(class1.isInstance(obj1)); // false because it is char
        obj1 = "1000"; 
        System.out.println(class1.isInstance(obj1)); // true because it is integer within quotes 
        
   }
}