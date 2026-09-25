import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};
        
        Arrays.stream(arr).filter(e-> e%2== 0).forEach(System.out::println);
    } 
}