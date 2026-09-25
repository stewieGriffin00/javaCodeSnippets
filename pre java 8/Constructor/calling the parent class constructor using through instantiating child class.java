class Main{
    public static void main(String[] args){
        // A a = new A(20);
        B b = new B();
    }
}

class A{
    int a;
    A(int a){
        this.a = a;
    }
    // A(){
    //     System.out.println("A class constructor is  invoked ");
    // }
    // we have to create another no parameter constructor if the super class has a parameterised
    // 
}

class B extends A{
    B(){
        System.out.println("B class constructor is  invoked s");
    }
}