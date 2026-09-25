// System.out.println();
class Generics{
    public static void main(String[] args){
        Integer[] ar1 = {1,2,3,4,5};
        Float[] arf = {1.23f, 45.5f, 66.98f};
        Class1<Number> ob = new Class1<>();
        ob.print(ar1);
        ob.print(arf);
    }
}

class Class1 <T>{
  void print(T[] arr){
    for(T a: arr){
        System.out.println(a);
    }
  }
}

