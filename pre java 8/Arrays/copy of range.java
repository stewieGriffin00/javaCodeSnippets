// System.out.println();
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        int[] arr1 = new int[arr.length];
        // arr1 = Arrays.copyOfRange(arr,0,16);
        arr1 = Arrays.copyOfRange(arr,0,13);
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1.length);
    }
}
/*    1. Arrays.copOfRange(array_reference, start_index, last element);
        last_element means the ordinal number of the element rather than index.
        so (arr, 3, 13) copies from 3,4...,13 (13 is the 13th element)

        2. if we try to copy an array range of larger than or less than what we initially declared the array to. We will exactly get what we asked
        if we asked to copy only 3 elements Jvm will do so. It will create
        a new array and assign it to the reference. So we will get a new array
        different from the size we initially declared.
        if I do 
        int[] arr = new int[5];
        arr = Arrays.copyOf(arr1,0,20);
        I will be assigned a new array element to arr which is size of 
        20 elements, different from the 5 that we initially declared 
 */