import java.util.IdentityHashMap;

class HashTables{
    public static void main(String[] args){
        IdentityHashMap<String, String> ihm1 = new IdentityHashMap<String, String>();

        String s1 = "One";
        String s2 = "One";

        ihm1.put(s1,"v 1");
        ihm1.put(s2,"v 2"); 
    //    System.out.println(ihm1);

        s2 = s1;
    //    System.out.println(ihm1);

        String s3 = new String("One");

        ihm1.put(s3,"v 3");
        // System.out.println(ihm1);

        String s4 =  new String("One");
        // System.out.println(s3 == s4);
        ihm1.put(s3,"v 4");
        // System.out.println(ihm1);

        ihm1.put("One","v 5");
        ihm1.put("One","v 6");
        // System.out.println(ihm1);
         
        ihm1.put(null,"v 8");
        ihm1.put(null,"v 7");
        // System.out.println(ihm1);
    }
}
/*    Identity hash map checks if the keys are same object or not 
    If they are then the values are overriden.
    Otherwise a new entry(key value pair) is created.
 */