// Exercise 1: Create 3 threads that print numbers 1-5 each. Observe interleaving.

class two {
    public static void main(String[] args) {
        
        Runnable r1= ()->{
            for (int i=1; i<6; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Runnable r2= ()->{
            for (int i=1; i<6; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Runnable r3= ()->{
            for (int i=1; i<6; i++) {
                System.out.println(Thread.currentThread().getName()+" "+i);
            }
        };

        Thread t1= new Thread(r1);
        Thread t2= new Thread(r2);
        Thread t3= new Thread(r3);

        t1.start();
        t2.start();
        t3.start();

    }    
}
