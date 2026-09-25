class MultiThreading{
    public static void main(String[] args){
        System.out.println(" main thread: "+Thread.currentThread().getName());
        Game ob1 = new Game();
        ob1.start();
        ob1.start();
    }
}

class Game extends Thread{
    @Override
    public void run(){
        for(int i=0; i<100; i++){
            System.out.println("sub-thread name: "+Thread.currentThread().getName()+" i: "+i);
        }
    }
}
/*  
    if we invoke two .start() methods using the same object we get only one output 
    but we 'Illegal Thread State Exception' exception. 
 */