import java.util.ArrayList;

class Main{
   public static void main(String[] args){
      ArrayList<String> al = new ArrayList<>();

      al.add("hello");
      al.add("dictionary");
      al.add("avatar");
      al.add("phone");
      al.add("India");
      al.add("Bus");
      al.add("Ticket");
      al.add("Spring_Boot");
      al.add("Java");

      System.out.println(" list is: "+al);
      al.stream().map(String:: toUpperCase).sorted().forEach(x-> System.out.print(x+" "));

   }
}