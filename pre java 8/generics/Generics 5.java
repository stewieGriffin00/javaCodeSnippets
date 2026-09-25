// System.out.println();
class Generics{
    public static void main(String[] args){
       Class1<Integer> ob1 = new Class1<>();
       Class1<Float> ob2 = new Class1<>();

       ob1.show(234,"Integer");
       ob2.show(3.14f,"String");
    }
}

class Class1 <T>{
        void show(T x, String s){
            System.out.println(s+" "+x);
        }
}
