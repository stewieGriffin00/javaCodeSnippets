class MultiThreading{
    public static void main(String[] args){
        System.out.println(" main thread: "+Thread.currentThread().getName());
        Game ob1 = new Game();
        ob1.start();
    }
}

class Game extends Thread{
    @Override
    public void run(){
        System.out.println("sub-thread name: "+Thread.currentThread().getName());
    }
}
