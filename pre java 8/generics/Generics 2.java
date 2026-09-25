// System.out.println();
class Generics{
    public static void main(String[] args){
        Class1 ob1 = new Class1();
        ob1.add(10,65);
    }
}

class Class1{
    <T> void add(T x, T y){
        Integer result = x.intValue()+ y.intValue(); 
        System.out.println(result);
    }
}