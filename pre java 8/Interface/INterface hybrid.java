class Daatabase{
    public static void main(String[] args){
        D ob1 = new D();
        ob1.method1();
        ob1.method2();
        ob1.method3();
    }
}

class D implements B,C{
    public void method1(){
        System.out.println(" method 1");
    }
    public void method2(){
        System.out.println(" method 2");
    }
    public void method3(){
        System.out.println(" method 3  ");
    }
}

interface B extends A{
    void method3();
}

interface C extends A{
    void method2();
}

interface A{
    void method1();
}