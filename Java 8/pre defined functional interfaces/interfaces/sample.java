// import java.util.function.Function;
// import java.util.ArrayList;
// import java.util.ListIterator;

import java.util.function.UnaryOperator;

class Main{
   public static void main(String[] args){
      
      UnaryOperator<String> s1 = (String s)-> " changed supplier method return value";
      System.out.println(s1.get());

      // ArrayList<String> sList = new ArrayList<>();
      // sList.add("java");
      // sList.add("python");
      // sList.add("ruby");
      // sList.add("spring");
      // sList.add("html");

      // System.out.println(sList);
   
      // Function<String, String> f1 = a->a.toUpperCase();
      // String s ; 
      // ListIterator<String> li = sList.listIterator();
      // while(li.hasNext()){
      //    s = li.next();
      //    li.remove();
      //    s = f1.apply(s);
      //    li.add(s);
      // }
      // System.out.println(sList);

   }
}
