// System.out.println(); 
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;

class Main{
   public static void main(String[] args){
        HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();

        hashmap1.put(1,"v-1"); 
        hashmap1.put(2,"v-2"); 
        hashmap1.put(3,"v-3"); 
        hashmap1.put(4,"v-4");

        Set<Map.Entry<Integer,String>> entries = hashmap1.entrySet();
        Iterator<Map.Entry<Integer,String>> iterator = entries.iterator();
        for(;iterator.hasNext();){
            System.out.println(iterator.next());
        }
   }  
}
