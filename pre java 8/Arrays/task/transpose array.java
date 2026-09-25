//   transpose array    
// public static void main(String[] args)
// System.out.println();
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[][] arr1 = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr2 = new int[arr1.length][arr1[0].length];
        
        System.out.println(" Old Array ");
        for(int i= 0; i<arr1.length; i++){
            for(int j= 0; j<arr1[i].length; j++){
                System.out.print(arr1[i][j]+" ");
            }
            System.out.println();
        }

        for(int i= 0; i<arr1.length; i++){
            for(int j= 0; j<arr1[i].length; j++){
                arr2[i][j] = arr1[j][i];
             }
        }

        System.out.println(" New Array ");
        for(int i= 0; i<arr2.length; i++){
            for(int j= 0; j<arr2[i].length; j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
