// 
// public static void main(String[] args)
// System.out.println();
import java.util.Arrays; 
class Database{
    public static void main(String[] args){
        int[] a ={1, 0, 2, 0, 3, 4, 0, 5};
        int aLength = a.length; // length: 8
        int lastIndex = aLength-1; // last Index: 7
        int temp = 0;
        for(int i=0; i<aLength; i++){
            if(a[i] == 0){
                // System.out.println(Arrays.toString(a)+" index "+i+" element is equal to zero ");
                for(int j= a.length-1; j>=i; j--){
                    // System.out.println(" j loop index: "+j);
                    if(a[j] != 0){
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                        // System.out.println(Arrays.toString(a)+" if con dition true index "+i);
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

