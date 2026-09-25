// System.out.println();
import java.util.Arrays;
class Database{
    public static void main(String[] args){
        int[] arr1 = {0, 1, 2, 3, 4, 5, 0, 2, 3, 4, 5};
        int[] e = {0};
        int eLength = 1;
        int count = 0;
        for(int i=0; i<arr1.length-1; i++){
            count= 1;
            if(e.length>1){
                for(int k=0; k<=e.length; k++){
                    if(arr1[i] == e[k]){
                        continue;
                    }
                }
            }

            for(int j=1; j< arr1.length; j++){
                if(arr1[i] == arr1[j]){
                    count++;
                }

                if(j == arr1.length-1){
                    System.out.println(arr1[i]+" count: "+count);
                    e[eLength-1] = arr1[i];
                    e = Arrays.copyOF(e, e.length+1);
                }
            }
        }
    }
}
