import java.util.stream.Stream;

class Main{
    public static void main(String[] args){

        Stream.iterate(2, y-> y+1).limit(10).forEach(System.out::println);
        
    } 
}