// System.out.println();
class EqualsMethod{
    public static void main(String[] args) throws CloneNotSupportedException{
        A ob1 = new A("hellos", 10);
        A ob2 = (A) ob1.clone(); 
        System.out.println(ob1.name); // hellos 
        System.out.println(ob2.name); // hellos
        ob2.name = "hiii";
        System.out.println(ob2.name); // hiii
        System.out.println(ob1.name); // hellos
    }
}

class A implements Cloneable{
    int num;
    String name;
    A(String name, int num){
        this.num = num;
        this.name = name;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
}
/*  If we invoke the .clone() method i௵n the class where the main method is when don't need the 
    overriding of the super class .clone() method in our class.
    But only when we use the objects of class who will use the clone method in another class,
    which has main method at that time we need to override the super class .clone() method
 */

