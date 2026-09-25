// System.out.println();
class Database{
    public static void main(String[] args){
        A ob1 = new B();
        B ob2 = (B)ob1;
        A ob3 = new C();
        B ob4 = (B) ob3;
    }
}

class A{

}
class B extends A{

}

class C extends A{

}