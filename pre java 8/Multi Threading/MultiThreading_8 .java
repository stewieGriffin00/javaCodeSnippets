class Main{
    public static void main(String[] args){
        Thread t1 = new Thread(){
                @Override
                public void run(){
                    for(int i=0; i<100; i++){
                        System.out.println(Thread.currentThread().getName()+" "+i);
                    }
                }
            };
        
        t1.start();
    }
}
/* Starting a class using anonymous inner class:
        Instead of declaring a class and then inheriting thread or Runnable. THen create an object for 
    that class and then pass  that object into constructor of thread class. 
    THen invoke the start() method using the tthread class object reference.

    We can do this.  
 */
