// System.out.println();
class WrapperClass{
    public static void main(String[] args){
        Integer i = 1087;
        Short s = 342;
        Boolean b = true;
        Double d = 12.3456;
        Character c = 'd';
        print("integer",i);
        print("short",s);
        print("boolean",b);
        print("double",d);
        print("Character",c);
    }
    static void print(String s,Object o){
        System.out.println(s+" "+o);
    }
}
/*  1. WE can pass any data type to the print class because it receives 'Object CLass' type object
    Since we boxed all the primitive type values into their respective wrapper class, we 
    can pass any type of object to it.
    
    2. we cannot done this if we passed primitve values to it because they are just variables
    not objects.
 */
