// System.out.println();
class Generics{
    public static void main(String[] args){
        Float f = 3.14f;
        Integer in = f.intValue();
        System.out.println(in+" converting float into int ");

        Double d = 34.00098;
        in = d.intValue();
        System.out.println(in+" converting double into int ");

        d = in.doubleValue();
        System.out.println(d+" converting int into double ");

        Integer abc = 123;
        f = abc.floatValue();
        System.out.println(f+" converting integer into float  ");    
    }
}
