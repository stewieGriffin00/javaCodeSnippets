// run this script in bash to execute this prorgramme non-stop.
// for /l %d in (0,0,1) do java file_name.java
class MultiThreading{
    public static void main(String[] args){
        Database ob1 = new Database();
        Database ob2 = new Database();
        ob1.setName("Jaffer thread ");
        ob1.start();
    }
}

class Database extends Thread {
    @Override
    public void run(){
        System.out.printf(" thread name: %s ",Thread.currentThread().getName());
    }
}