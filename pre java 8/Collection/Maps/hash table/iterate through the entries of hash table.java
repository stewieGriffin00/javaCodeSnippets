import java.util.Hashtable;
import java.util.Enumeration;

class HashTables{
    public static void main(String[] args){
        Hashtable<Integer, String> hashTable1 = new Hashtable<Integer, String>();

        hashTable1.put(3, "Banana");
        hashTable1.put(2, "Mango");
        hashTable1.put(1,"Apple");

        System.out.println(hashTable1);
        Enumeration e = hashTable1.elements(); // this only stores the elements(values) 
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }

        e = hashTable1.keys(); // this only stores the keys
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }
    }
}