import java.util.HashSet;
class HashSetCLass{
    public static  void main(String[] args){
        HashSet hs1 = new HashSet();
        hs1.add(300);
        hs1.add("batman");
        hs1.add(500);
        System.out.println(hs1);
        HashSet<Integer> hs2 = new HashSet<Integer>(hs1);
        System.out.println(hs2);
    }
}

