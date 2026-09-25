import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Sample{
    public static void main(String[] args){
        ClassTwo classTwo= new ClassTwo();
        ExecutorService execServ1= Executors.newFixedThreadPool(5);

        execServ1.execute(classTwo);
        execServ1.execute(classTwo);
        execServ1.execute(classTwo);
        execServ1.execute(classTwo);
        execServ1.execute(classTwo);

        execServ1.shutdown();
        
    }
}

class ClassTwo implements Runnable{
    @Override
    public void run(){
        for(int j=1; j<=10; j++){
            System.out.println(j+ " " + Thread.currentThread().getName());
        }
    }
}