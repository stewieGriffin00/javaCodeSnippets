import java.util.List;
import java.util.Arrays;

class Main{
    public static  void main(String[] args){
        List<String> words  = Arrays.asList("hello", "psychology", "silent", "laptop", "payslip","computer", "world", "entertainment");

        System.out.println("longest word: "+words.stream().sorted((x,y)-> y.length() - x.length()).findFirst().get());
    }
}


