import java.util.HashMap;
import java.util.Map.Entry;

class HashMaps{
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        hm.put(3, "Banana");
        hm.put(2, "Mango");
        hm.put(1,"Apple");
        System.out.println(" all values and keys in the hash map \n"+hm+"\n"); // print all the entries( entries is key value pairs of a hash map 
        // is called entries) in a hash map   
        System.out.println(" getting a value with key 1: "+hm.get(1)+"\n");

        hm.remove(3);

        System.out.println(" removing the key with value 'banana' "+hm);

        hm.put(3,"Banana");

        System.out.println("\n new entry "+hm);
        /* insertion order in hash map is not guaranted some times it preserves the order
           sometimes not.
           if the keys are numbers with only a small difference then it is sorted in an order
           otherwise the order will not be maintained 
           if i change the keys from 1,2,3 to 100, 2, 3000 then the hash map will     
           not maintain the insertion order. 
         */
    }
}