// another way to run a thread
class Threads{
    public static void main(String[] args){
        System.out.println();
        Thread t1 = new Thread(()->{
            for(int i= 1; i<=100; i++){
                System.out.println(" i: "+i);
            }
        });

        Thread t2 = new Thread(()->{
            for(int j= 1; j<=100; j++){
                System.out.println(" j: "+j);
            }
        });
        t1.start();
        t2.start();
    }
}