class Strings{
    public static void main(String[] args){
      // palindrome
      String word = "camellemac";
      for(int i = 0; i< word.length()/2; i++){
        if(word.charAt(i) == word.charAt((word.length()-1)-i)){
          
        }
        else{
          System.out.println(word+" is not palindrome ");
          break;
        }
        if(i == (word.length()-1)/2){
          System.out.println(word+" is palindrome ");
        }
      }      
    }
}


