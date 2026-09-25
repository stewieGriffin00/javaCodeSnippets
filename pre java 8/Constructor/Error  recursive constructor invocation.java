class Main{
    public static void main(String[] args){
        A a = new A();
    }
}

class A{
    static int count = 0;
    A(){
        this();
    }
}
