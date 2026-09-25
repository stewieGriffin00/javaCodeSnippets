// 
// public static void main(String[] args)
// System.out.println();
import java.util.Arrays; 
class Database{
    public static void main(String[] args){
        int[] a ={0,8,7,1,2,3,5};
        int temp = 0;
        int aLength = a.length;
        System.out.println(Arrays.toString(a));
        for(int i=0; i<a.length/2; i++){
            temp = a[i];
            a[i] = a[(a.length)-1-i];
            a[(a.length)-1-i] = temp;
        }
        System.out.println(Arrays.toString(a));
    }
}