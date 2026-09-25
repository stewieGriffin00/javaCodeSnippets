import java.util.HashMap;
import java.util.Map;

class HashMaps{
    public static void main(String[] args){
        HashMap<Integer, String> hm = new HashMap<Integer, String>();
        hm.put(3,"value3");
        hm.put(4,"value4");
        hm.put(1,"value1");
        hm.put(2,"value2");
        for(Map.Entry<Integer,String> me : hm.entrySet()){
            System.out.println(me.getValue());
        }
    }
}