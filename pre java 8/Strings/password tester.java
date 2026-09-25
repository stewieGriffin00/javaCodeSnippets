import java.util.Arrays;
import java.util.Scanner;
class DataBase{
    public static void main(String[] args){
        System.out.println(" enter your password ");
        String password = new Scanner(System.in).next();
        int[] arr = new int[password.length()];
        int up = 0, lc = 0, sc = 0, num = 0;
        int len = password.length();
        // System.out.println(arr.length+" "+password.length());
        for(int i =0; i<len; i++){
            arr[i] = password.charAt(i); 
        }
        // System.out.println(Arrays.toString(arr));
        for(int j=0; j<password.length(); j++){
            int i = password.charAt(j);
            if(i>= 97 && i<= 122 ){
                lc++;
            }
            else if(i>= 65 && i<=90){
                up++;
            }
            else if(i>=48 && i<=57){
                num++;
            }
            else{
                sc++;
            }
        }
        // System.out.println(" numbers: "+num+"\n special characters: "+sc+"\n upper case letters: "+up+"\n lower case: "+lc);
        System.out.println((lc==0 || up==0 || sc==0 || num==0 || (password.length()<10))?" passsword not accepted ":" passsword accepted ");
    }


}

