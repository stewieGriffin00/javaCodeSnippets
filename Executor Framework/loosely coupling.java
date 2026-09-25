class MyClass{
    public static void main(String[] args) {
        int i= 1;
        A a= null;
        if (i== 0) {
            a= new C();
            a.method();
        }
        else{
            a= new B();
            a.method();
        }
    }
}

class C extends A{
    @Override
    void method(){
        System.out.println("method C");

    }

}

class B extends A{
    @Override
    void method(){
        System.out.println("method B");

    }

}

class A{
    void method(){
        System.out.println("method A");
    }
}