class ConstructorChaining3{
    public static void main(String[] args){
        // System.out.println();
        Subbclass  ob1 = new Subbclass(10,20,"1st");
         ob1.displayValues();
    }
}

class Subbclass{
    int n,m;
    String s1;
    // double d1;
    Subbclass(){
        this.n = 11;
        this.m = 21;
        this.s1 = "2nd";
        this.displayValues();
        System.out.println(" No parameter constructor called ");
    }
    Subbclass(int n){
        this();
        this.n = 12;
        this.m = 22;
        this.s1 = "3nd";
        this.displayValues();
        System.out.println(" 1 paraamtr constuctor");
    }
    Subbclass(int n,int m){
        this(n);
        this.n = 13;
        this.m = 23;
        this.s1 = "3rd";
        this.displayValues();
        System.out.println(" 2 paraamtr constuctor");
    }
    Subbclass(int n, int m, String s1){
        this(n, m);
        this.n = 14;
        this.m = 24;
        this.s1 = "4th";
        this.displayValues();
        System.out.println(" 3 paraamtr constuctor called");
    }
    /* Subbclass(int n, int m, String s1, double d1){
        this.n = n;
        this.m = m;
        this.s1 = s1;
        this.d1 = d1;
        System.out.println(" 4 paraamtr constuctor");
    } */
    public void displayValues(){
        System.out.println(" n: "+n +" m: "+m+" s1: "+s1);
    }
}
