// print the elements in a Arraylist in backward oder

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
        ListIterator<Integer> lt = al1.listIterator(al1.size());
        Integer n = 0;
        // passing al1.size() into listiterator() moves the cursor to the end of the list 
        // if we had passed 2 it would it take it next to the 2nd element

        while(lt.hasPrevious()){ 
            // al1.add(99); // throws ConcurrentModificationException 
            // because we cannot use the array list methods inside the iterator 
            // if we want to add  any elements we can always use add methods of List Iterator itself.
            if(lt.previous() == 200){
                lt.add(67);
                // we added '67' after the number 200 in this using the add method of List iterator
            }
        }
        System.out.println(al1);
    }
}

