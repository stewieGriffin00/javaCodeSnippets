import java.util.ArrayList;
class Strings{
    public static void main(String[] args){
        ArrayList<String> al1 = new ArrayList<>(); 
        int[] arr = {10, 2, 9, 5, 7, 3, 6, 7, 5, 1};
        int sum = 12;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                continue;
            }
            for(int j= 1; j<arr.length; j++){
                if(i == j){
                    continue;
                }
                if(arr[i] + arr[j] == sum){
                    al1.add("("+arr[i]+", "+arr[j]+")");
                    arr[i] = 0;
                    arr[j] = 0; 
                }
            }
        }
        System.out.println(al1);
        /*   
            10 + 2
            9 + 3 
            5 + 7
            7 + 5 
         */
    }
}

