class MultiThreading{
    public static void main(String[] args){
        System.out.println(" main thread: "+Thread.currentThread().getName());
        Game ob1 = new Game();
        Thread t1 = new Thread(ob1);
        t1.start();
    }
}

class Game implements Runnable{
    @Override
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}
