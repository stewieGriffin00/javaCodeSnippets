class ConstructorChaining{
    public static void main(String[] args){
        Subclass obj1 = new Subclass();
        obj1.displayValues();
    }
}

class Subclass{
    int n,m;
    Subclass(){
        this(10,20);
        System.out.println(" no parameter constructor is called. ");
    }
    Subclass(int m){
        
        System.out.println(" one parameter construcutor is called. ");
    }
    Subclass(int n, int m){
        this.n =  n;
        this.m = m;
        System.out.println(" two parameter constructor is called. ");
    }
    public void displayValues(){
        System.out.println(" m: "+m+" n:"+n);
    }
}
