class Database{
    public static void main(String[] args){
        Class1 classOb1 = new Class1();
        Class1 classOb2 = classOb1.retObj();
        classOb2.show(); 
        Class2 class2Ob1 = new Class2();
        Class2 class2Ob2 = class2Ob1.retObj();
        class2Ob2.show();
    }
}

class Class1{
    public Class1 retObj(){
        return new Class1();
    }

    public void show(){
        System.out.println(" class1> show ");
    }
}

class Class2 extends Class1{
    @Override
    public Class2 retObj(){
        return new Class2();
    }
    @Override
    public void show(){
        System.out.println(" class2> show ");
    }
}

//  covariant return type is when a method returns an object if it is invoked.
//  Also this method can be overrid by the sub-class. reeturning its own object.
// Whenever we Override a method the return returned by both methods must 
// be same int for int, String for String. But during covarint return type 
// we return the child class object for child class method and parent class
// object for parent class method   