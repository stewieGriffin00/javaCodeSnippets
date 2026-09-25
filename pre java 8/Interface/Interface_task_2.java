class Interface{
    public static void main(String[] args){
        Hello ob1 = new Hello();
        ob1.method1();
        ob1.method1();
    }
}

interface inter1{
    public void method1();   
    // void method2();   
}

interface inter2{
    public void method1();   
    // void method4();   
}

class Hello implements inter1, inter2{
    public void method1(){
        System.out.println("Method 1");
    }

  
  /*   public void method1(){
        System.out.println("Method 3");
    } */
}

