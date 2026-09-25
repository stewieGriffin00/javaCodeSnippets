// find how many times a character repeats in a string using streams

import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Arrays;
import java.util.stream.Collectors;

class Main{
    public static void main(String[] args){
        List<String> list = Arrays.asList("java", "banana", "areoplane", "tata", "hello", "clap");
        
        Map<String, Integer> mp = list.stream().collect(Collectors.toMap(x->x, y-> { 
            int count = 0;
            for(int i=0; i<y.length(); i++){
                if(y.charAt(i) == 'a')
                    count++;
            }  return count;}));

        for(Map.Entry<String, Integer>  m : mp.entrySet()){
            System.out.println( " in "+m.getKey()+" 'a' comes "+ m.getValue() +" times ");
        }
    }

    
}