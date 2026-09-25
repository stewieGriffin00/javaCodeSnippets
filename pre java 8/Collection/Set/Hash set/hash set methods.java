import java.util.ArrayList;
import java.util.HashSet;
class HashSetCLass{
    public static  void main(String[] args){
        HashSet<Integer> hs1 = new HashSet<>();
        // add method
        hs1.add(100); 
        hs1.add(200); 
        hs1.add(300); 
        hs1.add(400); 
        hs1.add(500); 
        System.out.println(hs1);

        // add All method
        HashSet<Integer> hs2 = new HashSet<>();
        hs2.addAll(hs1);
        hs2.add(100000);
        hs2.add(300000);
        hs2.add(40000);
        hs2.add(200000);
        System.out.println(hs2);

        // contains method
        System.out.println(hs1.contains(100));
        System.out.println(hs1.contains(108));

        // contains all method
        System.out.println(hs2.containsAll(hs1));

        // remove
        hs1.remove(500);
        System.out.println(hs1);

        // remove all 
        hs2.removeAll(hs1);
        System.out.println(hs2); 
    }
}

