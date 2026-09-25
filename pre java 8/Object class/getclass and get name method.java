// System.out.println();
class EqualsMethod{
    public static void main(String[] args){
        A ob1 = new A();
        System.out.println(ob1.getClass());
        System.out.println(ob1.getClass().getName());
    }
}

class A{
    int age;
    String name;
    char ch;
    A(){
        age = 100;
        name = "default name.";
        ch = 'B';
    }
}