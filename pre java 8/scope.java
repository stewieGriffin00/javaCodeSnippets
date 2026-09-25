class Database{
    int m;
    Database(int m){
        this.m = m;
    }
    public static void main(String[] args){
        Database ob1 = new Database(10);
        ob1.func1();
        Database ob2 =new Database(20);
        ob2.func1();
    }
    void func1(){
        System.out.println(" Func1 is called ");
        func3();
    }
    static void func2(){
        System.out.println(" Func2 is called ");
    }
    void func3(){
        System.out.println(" Func3 is called "+this.m);
    }
}