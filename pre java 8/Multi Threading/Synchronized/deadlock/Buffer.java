package deadlock;

class Buffer{
    void test1(Buffer b){
        b.test2();
    }
    void test2(){
        System.out.println("Buffer > test 2");
    }
}
