// System.out.println();
class Inheritance{
    public static void main(String[] args){
        B ob1 = new B();
        ob1.show1();
        ob1.show2();
    }

}

class A{
   void show(){
    System.out.println(" show method ");
   }
}

class B extends A{
    void show1(){
        super.show();
    }
    void show2(){
        super.show();
    }
}


