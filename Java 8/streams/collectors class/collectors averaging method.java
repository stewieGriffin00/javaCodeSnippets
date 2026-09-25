import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        List<Integer> l = Arrays.asList(12,56, 90, 76, 54, 32, 12);

        double averageOftheNummber = l.stream().collect(Collectors.averagingInt(x-> x)); 

               
    }
}