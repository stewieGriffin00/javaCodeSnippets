class Strings{
    public static void main(String[] args){
        char[] w = word.toCharArray();

        for(int i=0; i<word.length; i++){
            if(w[i] == star[i]){
                count++;
            }
            if(count == word.length-1){
                break;
            }
        }
    }
}