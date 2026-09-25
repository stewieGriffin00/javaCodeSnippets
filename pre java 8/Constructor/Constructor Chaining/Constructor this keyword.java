class ConstructorChaining{
    public static void main(String[] args){
        Subclass obj1 = new Subclass(10,20);
        obj1.displayValues();
        Subclass obj2 = new Subclass();
        obj2.displayValues();
    }
}

class Subclass{
    int n,m;
    public Subclass(int n, int m){
        this.n = n;
        this.m = m;
    }
    public Subclass(){
        System.out.println(" No parameter constructor is called ");
        n = 30;
        m = 40;
    }
    public void displayValues(){
        System.out.println(" n: "+ this.n +" m:"+ this.m);
    }
}