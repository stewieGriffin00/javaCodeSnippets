// System.out.println();
import java.util.LinkedHashSet;

class HashSetCLass{
    public static  void main(String[] args){
        LinkedHashSet<Integer> lhs1 = new LinkedHashSet<>();
        lhs1.add(100); 
        lhs1.add(200); 
        lhs1.add(300); 
        lhs1.add(400); 
        lhs1.add(500);
        System.out.println(lhs1);

        lhs1.remove(300); 
        System.out.println(lhs1); 
    }
}
