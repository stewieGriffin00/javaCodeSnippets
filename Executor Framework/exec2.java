import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Sample {
    public static void main(String[] args) {
        ExecutorService exe1= Executors.newFixedThreadPool(5);
        for (int i=1; i<=5; i++) {
            exe1.execute(()->{
                    for (int j=1; j<=5; j++) {
                        System.out.println(j+" "+Thread.currentThread().getName());
                    }
                }
            );
        }       
        exe1.shutdown();
    }
}


