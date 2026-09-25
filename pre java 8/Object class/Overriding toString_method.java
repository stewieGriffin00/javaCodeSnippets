class DataBase{
    public static void main(String[] args){
        A ob1 = new A();
        System.out.println(ob1);
        /*  we overrided the to String method in class A so we will not 
            get has code if we print the hashcode.
         */
        B ob2 = new B();
        System.out.println(ob2);
        System.out.println(ob2);
        //  we called the hascode of 'ob2' object two times it produced the same 
        //  value both the times
        
    }
}

class A{
    int age;
    String name;
    char ch;
    A(){
        age = 100;
        name = "default name.";
        ch = 'B';
    }
    @Override
    public String toString(){
        return "name: "+name+" age: "+age+" ch: "+ch;
    }
}

class B{
    int age;
    String name;
    B(){
        age= 10;
        name= "DEfault name";
    }
}
