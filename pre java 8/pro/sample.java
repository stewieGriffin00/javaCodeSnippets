import java.util.ArrayList;
import java.util.ListIterator;

class Main{
    public static void main(String[] args){
        B b = new B(10,"1");
        C c = new C(20,"2");
        B b2 = new B(15,"3");
        C c2 = new C(25,"4");
        ArrayList<B> blist = new ArrayList<B>();
        blist.add(b);
        blist.add(b2);
        ArrayList<C> clist = new ArrayList<C>();
        clist.add(c);
        clist.add(c2);

        list(blist);
        list(clist);

    }
    static void list(ArrayList<? extends A> alist){
        System.out.println(alist);
    }
}

class A{
    int num;
    String age;
}

class B extends A{
    B(int num, String age){
        this.num = num;
        this.age = age;
    }
    @Override
    public String toString(){
        return "num: "+num+" age";
    }
}

class C extends A{
    C(int num, String age){
        this.num = num;
        this.age = age;
    }
    @Override
    public String toString(){
        return "num: "+num+" age";
    }
}