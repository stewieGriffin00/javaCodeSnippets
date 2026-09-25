// this code explains what method overriding  is and why we cannot override the static method of a class
// static methods cannot be overrided, but we did call the child class's method in this statemet
// b.myMethod();
// the above invocation calls the child class's method not parent class's method. this is not overriding.
// this is method hiding. 
// real overrding is when we store the object of a sub class inside a parent class's reference and if we 
// invoke the overrided method it invokes the child class's method not parent class's. 
// but in this case when we invoked it like this 
//  a2.myMethod();
// it still invoked the parent class's method even though the oject stored inside the reference is that of the 
// parent class's. This is not method overriding. 
// This happens because JVM resolves which method to call only in the run time not in compile time
// so what it checks in compile time then?
//  a2.myMethod(); in this statement it only ensures that the class of object reference a2 which is A exist 
//  or not. If not throw error if yes then okay. If the methood, myMethod() invoked in the statement exist 
// throw error if not exists. 
// actually which method to call when we are going to invoke the method depends on the object not the reference 
// and that is only resolved in run time not compile time that is why we call dynamic binding and polymorphism.

class MyClass{
    public static void main(String[] ars){
        A a= new A();

        A a2= new B();

        a.myMethod();

        a2.myMethod();

        B b= new B();

        b.myMethod();
    }
}

class A{
    static void myMethod(){
        System.out.println("A class's method");
    }
}


class B extends A{
    static void myMethod(){
        System.out.println("B class's method");
    }
}