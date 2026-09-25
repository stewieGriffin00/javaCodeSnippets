// System.out.println();
import java.util.Arrays;
class WrapperClass{
    public static void main(String[] args){
        Object[] o1 = {'k',99,9.81f,true};
        Arrays.sort(o1);
        for(Object o: o1){
            System.out.println(o);
        }
    } 
}
