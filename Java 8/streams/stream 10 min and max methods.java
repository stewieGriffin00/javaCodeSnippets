// 
import java.util.Comparator;
import java.util.Arrays;

class Main{
    public static void main(String[] args){
        String string = "java concept of the day";

        String[] strings = string.split(" ");

        //  sort the  elements in the string in alphabetical order and then get the first one. Natural order sorts the strings in aplphabetical aka lexicographical order 
        System.out.println(Arrays.stream(strings).min(Comparator.naturalOrder()).get()); // OP: concept

        //  sort the  elements in the string in reverse alphabetical order and then get the first one. reverse order sorts the strings in reverse aplphabetical aka lexicographical order 
        System.out.println(Arrays.stream(strings).min(Comparator.reverseOrder()).get()); 
        // OP: the 

        // if we want to compare the strings based on their length we use this Method.
        // comparingInt compares their lengths. inside we pass the object and we return their
        // lengths. 

        System.out.println(Arrays.stream(strings).max(Comparator.comparingInt(s-> s.length())).get()); // concept

        // this statement gets the one string with mininmum length.
        System.out.println(Arrays.stream(strings).min(Comparator.comparingInt(s-> s.length())).get()); // of

        // if we arrange them in natural alphabetical order we get the one that is in last 
        //  because this is max.
        System.out.println(Arrays.stream(strings).max(Comparator.naturalOrder()).get());

        // if we arrange them in reverse alphabetical order we get the one that is in last 
        //  because this is max.
        System.out.println(Arrays.stream(strings).max(Comparator.reverseOrder()).get());

    }
}