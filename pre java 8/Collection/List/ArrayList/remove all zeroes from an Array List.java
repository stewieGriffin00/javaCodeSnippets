//remove all zeroes from an Array List
import java.util.ArrayList;
class ArrayLists{
    public static void main(String[] args){
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(0);
        al.add(2);
        al.add(0);
        al.add(3);
        al.add(4);
        al.add(0);
        al.add(5);
        System.out.println(al);
        for(int i=0; i< al.size(); i++){
            if(al.get(i) == 0){
                al.remove(i);
                // System.out.println(al);
            }
        }
        System.out.println(al);
    }
}

