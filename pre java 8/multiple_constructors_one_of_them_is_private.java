class Database{
    public static void main(String[] args){
        // Class1 ob1 = new Class1(10);
        Class1 ob1 = new Class1();
        ob1.viewValue();        
    }
}

class Class1{
    int a;
    private Class1(int a){
        this.a = a;
    }
    Class1(){
        this(10);
        System.out.println(" no argument constructor is called ");
    }
    void viewValue(){
        System.out.println(" a:"+a);
    }
}

/* 
    We can define two constructors for a class. One of them is private and the other is non-private.
    We can 
 */