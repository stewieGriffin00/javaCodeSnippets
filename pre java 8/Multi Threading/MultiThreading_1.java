class MultiThreading{
    public static void main(String[] args){
        // System.out.println();
        Thread1 ob1 = new Thread1();
        ob1.start();
    }
}

class Thread1 extends Thread{
    public void run(){
        System.out.println(" hello world ");
    }
}

/* How to run threads in Java 
    Step 1: create a class 
    Step 2: extend "Thread" class to it 
    Step 3: define a method named run() in it.
    Step 4: inside that run() method write your code. 
    Step 5: create an object that has extended thread class and has run method in it,
    in the main method class.
    Step 6: use the .start() method to start the thread.
 */