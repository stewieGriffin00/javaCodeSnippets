// System.out.println(); 
import java.util.Map;
import java.util.HashMap;

class Main{
   public static void main(String[] args){
        HashMap<Integer, String> hashmap1 = new HashMap<Integer, String>();

        hashmap1.put(1,"v-1"); 
        hashmap1.put(2,"v-2"); 
        hashmap1.put(3,"v-3"); 
        hashmap1.put(4,"v-4");

        for(Map.Entry<Integer,String> mapEntry : hashmap1.entrySet()){
            System.out.println(" key: "+mapEntry.getKey()+" value: "+mapEntry.getValue());
        } 

        
   }  
}
