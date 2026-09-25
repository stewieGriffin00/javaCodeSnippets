// System.out.println();
import java.util.Arrays;
class WrapperClass{
    public static void main(String[] args){
        Integer[] i  = {1,2,3,4,5,6,7,7,88};
        Boolean[] b = {true, false, false, true, true, false};
        Character[] c = {'h','e','e','l','l','o'};
        Float[] f = {3.14f, 9.81f, 12.89f};
        forEach(i,"integer");
        forEach(b,"boolean");
        forEach(c,"character");
        forEach(f,"float");
    } 

    static void forEach(Object[] o, String s){
        System.out.println(s);
        System.out.println(Arrays.toString(o));
    }
}
