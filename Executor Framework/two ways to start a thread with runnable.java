
class Main {

    public static void main(String[] args) {

        Runnable r1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i + " " + Thread.currentThread().getName());
            }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);

        t1.start();
        t2.start();
    }
}

// class MyClass implements Runnable{
//     public void run(){
//         for (int i=0; i<10; i++) {
//             System.out.println(i+" "+ Thread.currentThread().getName());
//         }
//     }
// }
// class Main{
//     public static void main(String[] args) {
//         MyClass ob1= new MyClass();
        
//         Thread t1= new Thread(ob1);
//         Thread t2= new Thread(ob1);

//         t1.start();
//         t2.start();
//     }
// }

// class MyClass implements Runnable{
//     public void run(){
//         for (int i=0; i<10; i++) {
//             System.out.println(i+" "+ Thread.currentThread().getName());
//         }
//     }
// }