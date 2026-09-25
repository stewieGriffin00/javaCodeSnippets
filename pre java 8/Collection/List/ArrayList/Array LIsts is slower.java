import java.util.ArrayList;
class ArrayLists{
    public static void main(String[] args){
        // 
        long l1, l2, a, b;
        l1 = System.nanoTime();
        int[] intArray = new int[10_000_000];
        for(int i=0; i<10_000_000; i++){
            intArray[i] = i;
        }
        l2 = System.nanoTime();
        a = l2 - l1; 

        ArrayList<Integer> al1 = new ArrayList<Integer>();
        l1 = System.nanoTime();
        for(int i=0; i<10_000_000; i++){
            al1.add(i);
        }
        l2 = System.nanoTime();
        b= l2-l1;

        System.out.println((a>b)?" array is slower ":" arrayLists is slower "); 
        // O/P: array lists is slower
    }
}