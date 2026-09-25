import java.util.LinkedHashMap;
import java.util.Random;

class HashMaps{
    public static void main(String[] args){
        LinkedHashMap<Integer, Integer> lhm = new LinkedHashMap<Integer, Integer>();
        Random rnd = new Random();
        int m = 0;
        for(int i =0; i< 100 ; i++){
            m = rnd.nextInt(1,100);
            System.out.println(" key: "+ m+ " value: " +i+" \n");
            lhm.put(m, i);
        }
        System.out.println( lhm );
         /*  the insertion order is not preserved in this hash map  
           */
    }
}