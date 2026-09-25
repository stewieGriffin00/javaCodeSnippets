import java.reflections.Field;
class Reflections{
   public static void main(String[] args){
        Animal ob1 = new Animal();
        Class <?> class1 = ob1.getClass();
        for(Field f: class1.getDeclaredFields()){
            System.out.println(f.getName());
        }
    }
}

class Animal{
    int id1, id2;
}