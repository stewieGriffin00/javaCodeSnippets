// 
// public static void main(String[] args)
// System.out.println();
import java.util.Arrays; 
class Database{
    public static void main(String[] args){
        int[] a ={1, 0, 2, 0, 3, 4, 0, 5}; 
        int temp = 0;
        for(int i=0; i<aLength; i++){
            if(a[i] == 0){
                for(int j= a.length-1; j>=i; j--){
                    if(a[j] != 0){
                        temp = a[j];
                        a[j] = a[i];
                        a[i] = temp;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(a));
    }
}

