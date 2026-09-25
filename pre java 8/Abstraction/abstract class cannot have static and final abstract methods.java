class AbstractMain{
    public static void main(String[] args){
        A2 ob1 = new A2();
        ob1.say2();
        A2.say();
    }
}

abstract class A1{
    abstract static void say();
    abstract final void say2();
}

class A2 extends A1{
    static void say(){
        System.out.println("say method");
    }

    final void say2(){
        System.out.println("say2 method");
    }
}
 /* abstract class cannot have static and final abstract methods  
  */