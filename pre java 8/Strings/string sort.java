// System.out.println();
import java.util.Arrays;
class Strings{
    public static void main(String[] args){
        String[] names = {"java", "python", "c", "ruby", "html", "css", "spring", "sql"};
        String temp = null;
        for(int i=0; i<names.length-1; i++){
            for(int j=i+1; j<names.length; j++){
                if((names[i].compareTo(names[j]))>0){
                    temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
 
/*  
  */