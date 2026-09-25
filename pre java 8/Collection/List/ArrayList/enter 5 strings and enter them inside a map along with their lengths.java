// enter 5 strings and enter them inside a map along with their lengths  
import java.util.HashMap;
// import java.util.Iterator;
// import java.util.Map;
// import java.util.Scanner;
// import java.util.Arrays;

class HashMaps{
    public static void main(String[] args){
        // Scanner sc = new Scanner(System.in);
        // String[] words =  new String[5];
        String[] words =  {"java" , "python", "css", "springBoot", "mysql"};
        // System.out.println(" enter five words ");

        // for(int i=0; i<5; i++){
        //     words[i] = sc.nextLine();
        //     sc.nextLine();
        //     System.out.println(" next word ");
        // }
        // System.out.println(Arrays.toString(words));
        int[] len = new int[words.length];
        for(int i=0; i<len.length; i++){
            len[i] = words[i].length();
        }
        HashMap<Integer, String> hm = new HashMap<Integer, String>();

        for(int i=0; i<len.length; i++){
            hm.put(len[i], words[i]);
        }

        System.out.println(hm);
    }
}

