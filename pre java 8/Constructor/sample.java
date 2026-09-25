class Main{
    public static void main(String[] args){
        B b = new B();
    }
}

class A{
    // A(){
    //     System.out.println(" A class no parameter constructor is called ");
    // }

    A(int a){
        System.out.println(" A class parametrised constructor is called ");
    }
}

class B extends A{
    B(){
        System.out.println(" B class constructor is called ");
    }
}

/*    whenever we create an object for a class. Its parent class constructor is called.
    But in the case of B class when we instantiated it, it threw an error. 

    Because JVM usually provides a no default constructor with no parameters
    But since we created a constructor for the A class, JVM doesnot create a no paramter constructor
    
    So when we you created an object for B class it only had a no parameter constructor.
    But the super class had only a parameterised constructor, that is why when a created 
    an object for sub class it created an error.

    To resolve this you need to un comment the no paramter coonstructor so that super 
    class has a constructor similar to its sub class and doesn't create an error while 
    instantiating it.

 */