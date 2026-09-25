
class MyClass{
    public static void main(String[] ars){
        A.InnerClass ob= new A.InnerClass();

        System.out.println(ob.number);

        ob.innerClassMethod();

        ob.accessStaticMembersOfOuterClass();
    }
}

class A{

    static int variableName= 10; 
    
    static void myMethod(){
        System.out.println("A class's method");
    }


    static class InnerClass{

        int number= 100;
        
        void innerClassMethod(){
            System.out.println("inner method is executing");
        }

        void accessStaticMembersOfOuterClass(){
            System.out.println(variableName);
            

            myMethod();
        }
    }
}


