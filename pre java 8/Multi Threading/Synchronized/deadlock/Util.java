package deadlock;

class Util{
    static void sl(int m){
        try{
            Thread.sleep(m);
        }
        catch(InterruptedException iE){
            System.out.println("InterruptedException \n class: Util \n method: sl");
        }
    }
}