

class Main{
    public static void main(String[] args) {
        MyClass myclass= new MyClass();

        Thread t1= new Thread(myclass);
        
        Thread t2= new Thread(myclass);

        try {

            t1.start();
            t2.start();
            t1.join();
            t2.join();

        } 
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }

         myclass.getValue();
    }
}

class MyClass implements Runnable{
    // private static AtomicInteger num= new AtomicInteger(0);
    
    // @Override
    // public void run() {
        //     for (int i=0; i<10_000; i++) {
            //         num.incrementAndGet();
            
            //     }
            // }
            
    int num=0;
    @Override
    public void run() {
        for (int i=0; i<10_000; i++) {
            num++;
        }
    }

    public void getValue(){
        System.out.println(num);
    }
}

