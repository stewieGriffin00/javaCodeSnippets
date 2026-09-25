
class Main{
   public static void main(String[] args){
      Thread t1 = new Thread(()-> System.out.println("thread is started "));
      t1.start();

      Runnable t3 = ()-> System.out.println("hello world");

      Thread t4 = new Thread(t3);
      t4.start();
   }
}

