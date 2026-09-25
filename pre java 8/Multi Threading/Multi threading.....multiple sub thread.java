class MultiThreading{
    public static void main(String[] args){
        System.out.println(" main thread: "+Thread.currentThread().getName());
        Game ob1 = new Game();
        Game ob2 = new Game();
        ob1.start();
        ob2.start();
    }
}

class Game extends Thread{
    @Override
    public void run(){
        for(int i=0 ;i<1000; i++){
            System.out.println(Thread.currentThread().getName()+" i: "+i);
        }
    }
}
