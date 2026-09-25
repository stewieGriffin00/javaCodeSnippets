package deadlock;

class Thread1 extends Thread{
    Buffer b1,b2;
    Thread1(Buffer b1, Buffer b2){
        this.b1 = b1;
        this.b2 = b2;
    }
    @Override
    public void run(){
        b1.test1(b2);
    }
}