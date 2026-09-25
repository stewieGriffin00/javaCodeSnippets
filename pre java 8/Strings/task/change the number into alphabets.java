import java.util.Arrays;

class Strings{
    public static void main(String[] args){
        String a = "3a2b4c";
        // char[] charray = a.toCharArray();
        StringBuilder answer = new StringBuilder();
        int getNumber = 0;
        String s = null;
        // String b = a.substring(2, 3);
        for(int i=0; i<a.length(); i+=2){
            s = a.substring(i, i+1);
            getNumber = Integer.parseInt(s);
            // System.out.println(getNumber);
            for(int j=0; j<getNumber; j++){
                // answer.append(charray[i+1]);
                answer.append(a.substring(i+1,i+2));
            }
        }
        System.out.println(" input: "+a+" output: "+answer);
    }
}

