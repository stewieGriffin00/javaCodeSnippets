import java.util.ArrayList;
import java.util.ListIterator;

class Main{
    public static  void main(String[] args){
        ArrayList<Integer> al1 = new ArrayList<>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);
        ListIterator<Integer> lt = al1.listIterator();
        Integer n = 0;

        while(lt.hasNext()){ 
            if(lt.next() == 200){
                // al1.remove(2);
                // if we run the above statement we will get concurrent modification exception. Because when we iterate through the list or queue or set. We cannot use the reference of list or set or queue, to add or remove elements from the collection. We should ony use the reference of the iterator ior listerator

                lt.remove();
                lt.add(250);
            }
        }
        System.out.println(al1);
    }
}

