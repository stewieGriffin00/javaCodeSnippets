class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Thread t1=  new Thread(ob1);
        t1.start();
    }
}

class Database extends Thread{
    @Override
    public void run(){
        System.out.println(" B "+this.getName());
    }
}

// class Database implements Runnable{
//      @Override
//     public void run(){
//         System.out.println(" B "+Thread.currentThread().getName());
//     } 
// } 

/*  the difference between extending Thread class and Runnable interface 
    Thread class:
        1. we can extend the class that inherited the thread class to another class. 
    having both methods of the thread class and the user defined class.
        2. if we don't override the run()  in thread class it is not a problem.

    Interface:
        1. we can extend the this class but it will not have the properties of the Runnable 
    interface. ONly the user defined thread class.
        2. if we don't override the run() method in the user defined class it will cause an 
    error. 
        3. Inheriting the runnnable interface allows us to inherit other interfaces and a class
    as well. so we can have its properties and runnable interface properties as well.
 */