import java.util.TreeSet;
import java.util.Random;

class LinkedLists{
    public static void main(String[] args){
        TreeSet<Integer> ts1 = new TreeSet<Integer>();
        Random rand = new Random();
        int num;
        for(int i=0; i<20; i++){
            num = rand.nextInt(1,100);
            System.out.println(num);
            ts1.add(num);
        }

        for(int i: ts1){
            System.out.print(i+" ");
        }
    }
}
/*  Tree set inherits from the sorted map interface 
    1. it doesn't allow duplicate values
    2. it does'nt follow insertion order
    3. if we access the elements it gives us in the ascending order.
    4. when we elements inside a tree set it is stored in ascending order.
       using red black algorithm or binary tree algorithm  
 */