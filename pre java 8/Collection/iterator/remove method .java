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
            lt.next();
            lt.remove();
        }
        System.out.println(al1);
    }
}

