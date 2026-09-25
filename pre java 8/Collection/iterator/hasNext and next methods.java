// 
import java.util.ArrayList;
import java.util.ListIterator;

class Main{
    public static  void main(String[] args){
        ArrayList<Integer> al1 = new ArrayList<Integer>();
        al1.add(100);
        al1.add(200);
        al1.add(300);
        al1.add(400);
        al1.add(500);

        ListIterator<Integer> lt = al1.listIterator();
        while(lt.hasNext()){
            // the cursor is placed next to and between the elements. SO when we invoke
            // the .hasNext() method it sees if there is an element next to the cursor
            // which is true until it stands next to the last element.

            // the .next() method returns the element next to the cursor. and moves the 
            // cursor to the next element.
            System.out.println(lt.next()+" ");
        }
    }
}

