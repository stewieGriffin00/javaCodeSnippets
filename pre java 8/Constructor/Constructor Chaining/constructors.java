class Databse{
    public static void main(String[] args){
        // System.out.println();
        Db1 ob1 = new Db1(6657);
        Db1 ob2  = new Db1(342,"hello");
    }
}
class Db1{
    public Db1(int m){
        System.out.println(" m: "+m);
    }
    public Db1(int m,String n){
        System.out.println(" m: "+m);
        System.out.println(" n: "+n);
    }
    public Db1(){
        System.out.println(" no parameter ");
    }
}

