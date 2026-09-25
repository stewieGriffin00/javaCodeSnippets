import java.util.List;
import java.util.Set;
import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.Map;
import java.util.ArrayList;

class Main{
   public static void main(String[] args){
      List<Integer> l1 = Arrays.asList(10,20,30,40, 50, 10, 20, 30);
      List<String> stringList = Arrays.asList("stream", "java", "object", "functional_interface", "compiler", "class", "method");
      
      // changing the List into a list after passing it through a stream and using to List method
      List<Integer> newList = l1.stream().collect(Collectors.toList());
      System.out.println(newList);

      // changing the List into a set after passing it through a stream and using to set method
      Set<Integer> set1 = l1.stream().collect(Collectors.toSet());
      System.out.println(set1);

      // changing a list into a map. First parameter in the toMap() method is the element
      // second one is its length. we change it into any thing we want like. 
      // only take the first character as key in map using b.charAt(0) command.
      Map<String,Integer> map1 = stringList.stream().collect(Collectors.toMap(a->a, b-> b.length()));

      // since the map will only allow unique keys we have to pass a comparator in the 
      // third arugument. here (x,y) -> y means that  only take the second value
      // so the last value with the same key will only be taken, after overriden 
      // by all the other strings with same length.   
      Map<Integer, String> map2 = stringList.stream().collect(Collectors.toMap(b-> b.length(), a->a, (x,y)-> y));

      System.out.println(map1); 
      System.out.println(map2);

      // joining method: it joins all the elements and prints it as a string
      String allJoined = stringList.stream().collect(Collectors.joining());
      System.out.println(allJoined);

      // joining method using delimiter: if we pass a "," comma the elements will be separated 
      // by a comma 
      allJoined = stringList.stream().collect(Collectors.joining(", "));
      System.out.println("\n "+allJoined);

      // joining method with a prefix, suffix and delimiter
      // 2nd argument is prefix and 3rd argument is suffix
      allJoined = stringList.stream().collect(Collectors.joining(", ","[","]"));
      System.out.println("\n "+allJoined);
      
      // grouping by:  this method groups the elements of the List based on a criteria
      // here we grouped it using the lengths of the string all the strings with same 
      // lengths will be stored in a list and it will be stored in the value of the map
      // and the key will be its length

      // Map<Object, List<String>> mapWithLength =   stringList.stream().collect(Collectors.groupingBy(s -> s.length()));
      Map<Object, List<String>> mapWithFirstLetter =   stringList.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));

      System.out.println("\n "+mapWithFirstLetter);

       List<String> l = Arrays.asList("hello", "halo", "help", "happy", "java", "jolly", "joker");
      // System.out.println(l);

      // Map<Integer, List<String>> k = l.stream().collect(Collectors.groupingBy(x-> x.charAt(0)));
      Map<Character, List<String>> k = l.stream().collect(Collectors.groupingBy(x-> x.charAt(0)));
      System.out.println(k);
      
      Map<Integer, List<String>> mapWithLength =   stringList.stream().collect(Collectors.groupingBy(s -> s.length()));

      System.out.println(" map with length "+mapWithLength);
      // instead of mentioning object in the object reference we can mention the data type of the 
      // object itself like here we wrote Integer instead of object 


      // toCollection method is used for storing the elements inside a collections class 
      // which collection class is determined by the constructor reference we pass in the 
      // toCollection method   
      ArrayList<String> arrayList = stringList.stream().collect(Collectors.toCollection(ArrayList:: new));

      ArrayList<String> arrayList2 = stringList.stream().collect(Collectors.toCollection(()->new ArrayList<String>()));

      // List<String> List3 = stringList.stream().collect(Collectors.toCollection(List::new));

      System.out.println(arrayList);
      System.out.println(arrayList2);
      // System.out.println(List3);
   }
}

