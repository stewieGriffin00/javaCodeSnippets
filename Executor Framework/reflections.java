import java.lang.reflect.Field;

class Test{
    public static void main(String[] args) throws Exception{
        A a= new A(2907);

        // System.out.println(a.i);

        Class<?> classA= a.getClass();

        Field f= classA.getDeclaredField("i");  

        f.setAccessible(true);

        Integer i= (Integer) f.get(a);
        
        System.out.println(i);

    }
}

class A{
    private int i;

    A(int i){
        this.i= i;
    }
}
