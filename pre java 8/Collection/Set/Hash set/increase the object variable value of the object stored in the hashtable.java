import java.util.HashSet;
import java.util.Iterator;

class HashSetCLass{
    public static  void main(String[] args){
        HashSet<A> hs1 = new HashSet<>();

        hs1.add(new A(10));
        hs1.add(new A(20));
        hs1.add(new A(30));
        System.out.println(hs1);

        Iterator<A> i = hs1.iterator();
        while(i.hasNext()){
            A ob = i.next();
            ob.increase();
        }
        System.out.println(hs1);
    }
}

class A{
    int i;
    A(int i){
        this.i = i;
    }
    @Override
    public String toString(){
        return i+"";
    }
    public void increase(){
        i += 100;
    }
}
