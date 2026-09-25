package deadlock;

class MainClass{
    public static void main(String[] args){
        Buffer b1 = new Buffer();
        Buffer b2 = new Buffer();

        Thread1 t1 = new Thread1(b1,b2);
        Thread1 t2 = new Thread1(b1,b2);
        t1.start();
        t2.start();
    }
}
