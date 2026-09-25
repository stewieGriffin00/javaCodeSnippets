
import java.util.*;

class sample {

    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        try {
            numbers = Collections.unmodifiableList(numbers);
            numbers.add(40);
            System.out.println(numbers);

        } catch (Exception e) {
            System.out.println("you cannot modify an unmodifiable List it will cause: \n"+ e);
        }
    }
}
