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

        ListIterator<Integer> lt = al1.listIterator(al1.size());
        // Passing a number into the listIterator method take the cursor to that specific element. 
        // al1.size() is equal to 5 so if we pass it into the Method. It takes the Method to the last element. We can take the cursor to any element  we want.  And iterate forward or backward. We can call .next() or .previous according to need.

        System.out.println("Backward direction");
        while(lt.hasPrevious()){
            System.out.println(lt.previous()+" ");
        }

        lt = al1.listIterator();
        System.out.println("Forward direction");
        while(lt.hasNext()){
            System.out.println(lt.next()+" ");
        }
    }
}

