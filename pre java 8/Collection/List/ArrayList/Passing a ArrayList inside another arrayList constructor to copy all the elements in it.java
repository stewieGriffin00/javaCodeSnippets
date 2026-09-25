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
       
        ArrayList<Integer> al1 = new ArrayList<>(al);
        System.out.println(al1);
    }
}

