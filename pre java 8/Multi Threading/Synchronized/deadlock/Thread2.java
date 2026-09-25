package deadlock;

class Thread2 extends Thread{
    Buffer b1,b2;
    Thread2(Buffer b1, Buffer b2){
        this.b1 = b1;
        this.b2 = b2;
    }
    @Override
    public void run(){
        b2.test1(b1);
    }
}
