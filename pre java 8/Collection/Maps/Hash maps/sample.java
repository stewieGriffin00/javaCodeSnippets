import java.util.HashMap;
import java.util.Map;
import java.util.Set        ;
import java.util.Iterator;

class HashMaps{
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(3,"value3");
        hm.put(4,"value4");
        hm.put(1,"value1");
        hm.put(2,"value2");

        Set <Map.Entry<Integer, String>> s = hm.entrySet();
        Iterator <Map.Entry<Integer, String>> i = s.iterator();

        while(i.hasNext()){
            System.out.println(i.next());
        }
    }
}