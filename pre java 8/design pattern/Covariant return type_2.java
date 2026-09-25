class Database{
    public static void main(String[] args){
        // Class1 classOb1 = new Class1();
        // Class1 classOb2 = classOb1.retObj();
        // classOb2.show(); 
        Class2 class2Ob1 = new Class2();
        Class1 class2Ob2 = class2Ob1.retObj();
        class2Ob2.show();
    }
}

class Class1{
    int m =100;
    public Class1 retObj(){
        return new Class1();
    }

    public void show(){
        System.out.println(" class1> show ");
    }
}

class Class2 extends Class1{
    @Override
    public void show(){
        System.out.println(" class2> show ");
    }
}