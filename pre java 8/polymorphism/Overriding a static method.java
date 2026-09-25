class Database{
    public static void main(String[] args){
        Dog.print();
    }
}

class Animal{
    static void print(){
        System.out.println("\t ANimal class method");
    }
}

class Dog extends Animal{
    // @Override // static methods cannot be annotated with @Override
    static void print(){
        System.out.println("\t Dog class method");
    }
}