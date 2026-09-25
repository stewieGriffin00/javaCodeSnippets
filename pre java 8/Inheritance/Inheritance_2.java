// System.out.println();

class Inheritance{
    public static void main(String[] args){
        vehicle ob1 = new vehicle();
        ob1.ride();
        bike ob2 = new bike();
        ob2.twoWheeler();
        R15 ob3 = new R15();
        ob3.r15();
    }
}

class vehicle{
    public void ride(){
        System.out.println(" ride method from vehicle class ");
    }
}

class bike extends vehicle{
    public void twoWheeler(){
        System.out.println(" from two wheeler function in bike class ");
    }
}

class R15 extends bike{
    public void r15(){
        System.out.println(" from R15 class method r15 ");
    }
}