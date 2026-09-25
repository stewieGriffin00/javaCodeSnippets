import java.util.LinkedList;
import java.util.ArrayList;

class LinkedLists{
    public static void main(String[] args){
        long l1, l2, a, b;
        l1 = System.nanoTime();
        LinkedList<Integer> ll1  = new LinkedList<Integer>();
        for(int i=0; i<10_00_000; i++){
            ll1.add(i);
        }
        l2 = System.nanoTime();
        a = l2 - l1;
        
        l1 = System.nanoTime();
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        for(int i=0; i<10_00_000; i++){
            al1.add(i);
        }
        l2 = System.nanoTime();
        b = l2 - l1;
        System.out.println(a<b?" linked lists is faster ":"  array lists is faster");
    }
}