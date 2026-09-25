// System.out.println();
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[][] arr =new int [4][];
        arr[0] = new int[2];
        arr[1] = new int[4];
        arr[2] = new int[3];
        arr[3] = new int[7];
        System.out.println(Arrays.deepToString(arr));
    }
}

/* Jagged array is where the internal arrays have different lengths
    eg:{ {1,2,3},{1,2},{1,5,4,3} }
    in matrix form 
      1 2 3
      1 2 
      1 5 4 3
 */