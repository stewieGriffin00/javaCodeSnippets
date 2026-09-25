class MyClass{
    public static void main(String[] args) {
    //     Chennai chennai= new Chennai();
    //     Delhi delhi= new Delhi();

    //    chennai.delhi = delhi;
       
    //    delhi.chennai= chennai;

    //    TaskA taskA= new TaskA(chennai);

    //    TaskB taskB= new TaskB(delhi);

    //    Thread t1= new Thread(taskA, "T-1");

    //    Thread t2= new Thread(taskB, "T-2");

    //    t1.start();
    //    t2.start();

        final Object a= new Object();
        final Object b= new Object();


        Thread t1= new Thread(()->{
            synchronized(a){
                System.out.println("acquired lock on object A");

                try {
                    Thread.sleep(1000);
                    System.out.println("sleep");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }

                synchronized (b) {
                    System.out.println("acquired lock on object B");
                }
            }
        }, "t-1");


        Thread t2 = new Thread(() -> {
            synchronized (b) {
                System.out.println("acquired lock on object B");
                try {
                    Thread.sleep(1000);
                    System.out.println("sleep");
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                }

                synchronized (a) {
                    System.out.println("acquired lock on object A");
                }
            }

        }, "t-2");

        t1.start();
        t2.start();
    }
}

// class TaskA implements Runnable{
//     Chennai chennai;

//     public TaskA(Chennai chennai) {
//         this.chennai = chennai;
//     }

//     @Override
//     public void run(){
//        chennai.methodA();
//     }
// }

// class TaskB implements Runnable{
//     Delhi delhi;

//     public TaskB(Delhi delhi) {
//         this.delhi = delhi;
//     }
    
//     @Override
//     public void run(){
//         delhi.methodC();
//     }
// }

// class Chennai{
//     Delhi delhi;

//     public synchronized  void methodA(){
//         System.out.println(" method A is called"+" "+Thread.currentThread().getName());
//         delhi.methodD();
//     }

//     public synchronized  void methodB(){
//         System.out.println(" method B is called"+" "+Thread.currentThread().getName());
//     }
// }

// class Delhi{
//     Chennai chennai;

//     public synchronized  void methodC(){
//         System.out.println(" method C is called"+" "+Thread.currentThread().getName());
//         chennai.methodB();
//     }

//     public synchronized  void methodD(){
//         System.out.println(" method D is called"+" "+Thread.currentThread().getName());
//     }
// }

// public class Helo{

//     public static void main(String[] args) throws InterruptedException {

//         final Object lockA = new Object();
//         final Object lockB = new Object();

//         Thread t1 = new Thread(() -> {
//             synchronized (lockA) {
//                 System.out.println(Thread.currentThread().getName() 
//                     + " acquired Lock-A, waiting for Lock-B...");

//                 try { Thread.sleep(100); } catch (InterruptedException e) { 
//                     Thread.currentThread().interrupt(); 
//                 }

//                 synchronized (lockB) {
//                     System.out.println(Thread.currentThread().getName() 
//                         + " acquired Lock-B");
//                 }
//             }
//         }, "Thread-1");

//         Thread t2 = new Thread(() -> {
//             synchronized (lockB) {
//                 System.out.println(Thread.currentThread().getName() 
//                     + " acquired Lock-B, waiting for Lock-A...");

//                 try { Thread.sleep(100); } catch (InterruptedException e) { 
//                     Thread.currentThread().interrupt(); 
//                 }

//                 synchronized (lockA) {
//                     System.out.println(Thread.currentThread().getName() 
//                         + " acquired Lock-A");
//                 }
//             }
//         }, "Thread-2");

//         t1.start();
//         t2.start();
//     }
// }
