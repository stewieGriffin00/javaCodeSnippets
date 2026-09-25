import java.util.Arrays;
class ArrayList{
    public static void main(String[] args){
        int[] arr1 = {0, 1, 2, 3, 4, 5};  // 3
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(shift(arr1,3,100)));
    }   

    static int[] shift(int[] a,int index, int v){
        int new_size = a.length+1;
        a = Arrays.copyOf(a,new_size);
        for(int i = a.length-1; i>index; i--){ // i = 6
            a[i] = a[i-1];
        }
        a[index] = v;
        return a;
    }
}

