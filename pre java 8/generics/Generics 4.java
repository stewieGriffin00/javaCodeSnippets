// System.out.println();
class Generics{
    public static void main(String[] args){
        Class1<Integer> ob  = new Class1<>();
        ob.add(78,54);
    }
}

class Class1 <T extends Number>{
         void add(T a, T b){
            Integer abc;
            abc = a.intValue() + b.intValue();
            System.out.println(abc);
        }
}
