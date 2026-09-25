// System.out.println();
class Generics{
    public static void main(String[] args){
        Class1<Integer> ob1 = new Class1<>();
        ob1.add(10);
    }
}

class Class1 <T>{
    void add(T x){ 
        System.out.println(" x: "+x);
    }
}