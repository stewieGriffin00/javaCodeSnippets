import java.util.HashSet;
import java.util.Iterator;

class HashSetCLass{
    public static  void main(String[] args){
        HashSet<String> hs1 = new HashSet<>();
        hs1.add("product 1"); 
        hs1.add("product 2"); 
        hs1.add("product 3"); 
        hs1.add("product 4"); 
        hs1.add("product 5"); 

        HashSet<String> hs2 = new HashSet<>();
        hs2.add("product 1"); 
        hs2.add("product 2"); 
        hs2.add("product 7"); 
        hs2.add("product 8"); 
        hs2.add("product 9"); 

        System.out.println(hs1);
        System.out.println(hs2);

        Iterator<String> it1 = hs1.iterator(); 
        Iterator<String> it2 = hs2.iterator(); 
        
        while(it1.hasNext()){
            String s1 = it1.next();
            while(it2.hasNext()){
                String s2 = it2.next();
                if(s1==s2){
                    System.out.println(" match "+s2);
                }
            }
            it2 = hs2.iterator();
        }
        System.out.println(" programme end ");
    }
}
