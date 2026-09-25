class MultiThreading{
    public static void main(String[] args){
        Thread1 t1 = new Thread1();
        t1.start();
    }
}

// Thread sleep
class Thread1 extends Thread{
    public void run(){
        System.out.println("Right half pyramid");
        try{
            for(int i =1;  i<=5; i++){
                for(int j= 1; j<= i; j++){
                    System.out.print("* ");
                }
                System.out.println();
                Thread.sleep(750);
            }
        }
        catch(InterruptedException e){
            System.out.println(" Thread is interruupted ");
        }
    }
}
