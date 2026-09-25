class Multithreading{
    public static void main(String[] args) throws InterruptedException{
        Thread t1 = new Thread(()->{
            for(int i=1; i<100; i++){
                if(i==99){
                    System.out.println(Thread.currentThread().getName()+" "+i);
                }
            }
        },"T-1");
        
        Thread t2 = new Thread(()->{
            for(int i=1; i<100; i++){
                    if(i==99){
                        System.out.println(Thread.currentThread().getName()+" "+i);
                    }            
            }
        },"T-2");

        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println("both thread finish ");
    }
}

