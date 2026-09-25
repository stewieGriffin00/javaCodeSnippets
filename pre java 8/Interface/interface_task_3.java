class InterfaceMain{
    public static void main(String[] args){
        UsingClass ob1 = new UsingClass();
        ob1.method1();
        ob1.method2();
        ob1.method3();
        ob1.method4();
        ob1.method5();
    }
}   

class UsingClass implements interface1, interface2{
    public void method1(){
        System.out.println(" method 1");
    }
    public void method2(){
        System.out.println(" method 2");
    }
    public void method3(){
        System.out.println(" method 3");
    }
    public void method4(){
        System.out.println(" method 4");
    }
    public void method5(){
        System.out.println(" method 5");
    }
}

interface interface1{
    public void method1();
    public void method2();
}

interface interface2 extends interface1{
    public void method3();
    public void method4();
    public void method5();
}