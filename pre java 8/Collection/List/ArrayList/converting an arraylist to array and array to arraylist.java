// converting an arraylist to array and an array to arraylist 

import java.util.ArrayList;
import java.util.Arrays;

class ArrayLists{
    public static void main(String[] args){
        int[] ar = {1,2,2,3,3,4,5,6,7,7,8,8,9};
        ArrayList<Integer> al = new ArrayList<Integer>();
        int len = ar.length;
        for(int i=0; i<len; i++){
            al.add(ar[i]);
        }
        System.out.println(al);
        int sizeOfArraylist = al.size();
        int[] ar1 = new int[sizeOfArraylist];
        for(int i=0; i< ar1.length; i++){
            ar1[i] = al.get(i);
        }
        System.out.println(Arrays.toString(ar1));
    }
}