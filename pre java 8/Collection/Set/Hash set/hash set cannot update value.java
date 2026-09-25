import java.util.HashSet;
import java.util.Iterator;

class HashSetCLass{
    public static  void main(String[] args){
        HashSet<Integer> hs1 = new HashSet<>();

        hs1.add(100);
        hs1.add(200);
        hs1.add(300);
        hs1.add(400);
        System.out.println(hs1);

        Iterator<Integer> i = hs1.iterator();
        while(i.hasNext()){
            System.out.println(i.next()+100);
        }
        System.out.println(hs1);
    }
}

