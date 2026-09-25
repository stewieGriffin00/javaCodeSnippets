class ConstructorChaining2{
    public static void main(String[] args){
        // System.out.println();
        Subbclass  ob1 = new Subbclass();
        ob1.displayValues();
    }
}

class Subbclass{
    int n,m;
    String s1;
    double d1;
    Subbclass(){
        this(10);
        System.out.println(" No parameter constructor called ");
    }
    Subbclass(int n){
        this(n,100);
        System.out.println(" 1 paraamtr constuctor");
    }
    Subbclass(int n,int m){
        this(n,m," String hello");
        System.out.println(" 2 paraamtr constuctor");
    }
    Subbclass(int n, int m, String s1){
        this(n, m, s1, 3.14);
        System.out.println(" 3 paraamtr constuctor");
    }
    Subbclass(int n, int m, String s1, double d1){
        this.n = n;
        this.m = m;
        this.s1 = s1;
        this.d1 = d1;
        System.out.println(" 4 paraamtr constuctor");
    }
    public void displayValues(){
        System.out.println(" n: "+n +" m: "+m+" s1: "+s1+" d1: "+d1);
    }
}
