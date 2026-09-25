
class Main{
   public static void main(String[] args){
      Thread r = new Thread(){
         public void run(){
            System.out.println("hellow world");
         }
      };      
      r.start();
   }
}