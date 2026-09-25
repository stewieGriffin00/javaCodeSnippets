import java.util.Arrays;
class Strings{
    public static void main(String[] args){
        String[] values = {"aeroplane", "elephant", "zebra", "foreign", "letter", "number"};
        String[] answer = new String[6];
        System.out.println(Arrays.toString(values));
        Arrays.sort(values);    
        System.out.println(Arrays.toString(values));    
        int j=0, k= values.length-1;

        for(int i=0; i<answer.length; i++){
            if(i%2 == 0){
                answer[i] = values[k];
                k--;
            }
            else if(i%2 != 0){
                answer[i] = values[j];
                j++;
            }
        }    
        System.out.println(Arrays.toString(answer));    
    }
}

