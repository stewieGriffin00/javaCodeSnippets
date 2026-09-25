import java.util.Arrays;

class Strings{
    public static void main(String[] args){

       String s1 = "silent";
       String s2 = "listen";
       char[] c1 = s1.toCharArray();
       char[] c2 = s2.toCharArray();
       
       Arrays.sort(c1);
       Arrays.sort(c2);

        for(int i=0; i<c1.length; i++){
            if(c1[i] != c2[i]){
                System.out.println(" it is not anagram ");   
                return;
            }
        }
        System.out.println(s1+" and "+s2+" is anagram  ");
    }
}