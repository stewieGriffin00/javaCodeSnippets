// System.out.println();
class Generics{
    public static void main(String[] args){
        A a = new A();
        B b = new B();

       Class1<A> ob1 = new Class1<>();
       Class1<B> ob2 = new Class1<>();

       ob1.show(a,"Class A");
       ob2.show(b,"Class B");
    }
}

class Class1 <T>{
    void show(T x, String s){
        System.out.println(s+" "+x);
    }
}

class A{}

class B{}
