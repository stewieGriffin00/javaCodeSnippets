// running thread using runnable interface

class MultiThreading{
    public static void main(String[] args){
        // System.out.println();
        Runnable ob1 = new Thread1();
        Thread t1 = new Thread(ob1);
        t1.start();
    }
}

class Thread1 implements Runnable{
    int j = 1;
    public void run(){
        while(j <= 10){
            System.out.println("    j: "+j);
            j++;
        }
    }
}
/* 
class Thread2 extends Thread{
    int i = 1;
    public void run(){
        while(i <= 50){
            System.out.println("    i: "+i);
            i++;
        }
    }
} */

/* Notes:
    Run threads in java using Runnnable interface
    Step 1: create a class and implement runnable interface
    Step 2: define a method inside that class named as run()
    Step 3: create an object of that class and store it inside the reference of Runnable interface
    Step 4: create an object for the thread class ( pre defined java class) pass the object 
        of the thread class that user created into that object
    Step 5: now invoke run method by using th object of the thread class

    Advantages of using Runnable interface:
        1. we can extend another class also. 
 */