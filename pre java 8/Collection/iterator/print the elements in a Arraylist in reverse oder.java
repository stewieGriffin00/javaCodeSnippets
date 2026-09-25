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
        ListIterator<Integer> it = al1.listIterator(al1.size());
        // passing al1.size() into listiterator() moves the cursor to the end of the list 
        // if we had passed 2 it would it take it next to the 2nd element

        while(it.hasPrevious()){ 
            System.out.print(it.previous()+" "); // o/p : 500 400 300 200 100
        }
    }
}

