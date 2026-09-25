// System.out.println();
class EqualsMethod{
    public static void main(String[] args){
        A ob1 = new A();
        A ob2 = new A();
        System.out.println(" calling gc");
        System.gc();
        A ob3 = new A();
        System.out.println(" assigning null ");
        ob3 =  null;
        A ob4 = new A();
        A ob5 = new A();
    }

}

class A{
    @Override
    public void finalize(){
        System.out.println(" calling finalize method ");
    }
}


