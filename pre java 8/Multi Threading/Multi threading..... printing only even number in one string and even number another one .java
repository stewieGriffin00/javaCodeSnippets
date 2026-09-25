class MultiThreading{
    public static void main(String[] args){
        Game ob1 = new Game();
        Game ob2 = new Game();
        ob1.start();
        ob2.start();
    }
}

class Game extends Thread{
    @Override
    public void run(){
        for(int i=0; i<10; i++){
            if(Thread.currentThread().getName().equals("Thread-0") && i%2 ==0){
                System.out.println(" even number "+i+" "+Thread.currentThread().getName());
            }
            else if(Thread.currentThread().getName().equals("Thread-1") && i%2 !=0){
                System.out.println(" Odd number "+i+" "+Thread.currentThread().getName());
            }
            else{
            }
        }
    }
}
