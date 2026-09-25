// System.out.println();
class Generics{
    public static void main(String[] args){
        A a = new A();
        B b = new B();

       Class1<A, B> ob1 = new Class1<>();

       ob1.show(a,"Class A","Class B",b);
    }
}

class Class1 <T, E>{
    void show(T x, String s, String s1, E y){
        System.out.println(s+" "+x+" "+s1+" "+y);
    }
}

class A{}

class B{}
