// reverse the order of an  array's elements and store it into an arraylist 
import java.util.ArrayList;
import java.util.Arrays;

class ArrayLists{
    public static void main(String[] args){
        int[] ar = {1,2,2,3,3,4,5,6,7,7,8,8,9};
        ArrayList<Integer> al = new ArrayList<Integer>();
        int len = ar.length;
        for(int i=len-1; i>=0; i--){
            al.add(ar[i]);
        }
        System.out.println(al);
        
    }
}