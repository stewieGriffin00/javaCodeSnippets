// System.out.println(); 
// if we have two constructors in a class one is argumented and another one is no argument 
// then when we create an object for a class that inherited this class 
// THen only the constructor with no parameter will be called. The argumented constructor 
// will not be called. 
class Main{
    public static void main(String[] args){
        B b = new B(); // class A > no argument constructor
                        // class B > Constructor
    }   
}

class A{
    A(){
       System.out.println(" class A > no argument constructor"); 
    }

    A(int m){
       System.out.println(" class A > argument constructor"); 
    }
}

class B extends A{
    B(){
        System.out.println(" class B > Constructor ");
    }
}
