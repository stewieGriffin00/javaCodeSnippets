// find first non-repeating character

class Strings{
  public static void main(String[] args){
    String word = "entertainment";
    char[] chArray = word.toCharArray();
    int count = 0;
    for(int i=0; i< chArray.length; i++){
      count = 0;
      for(int j=0; j< chArray.length; j++){
        if(chArray[i] == chArray[j]){
          count++;
        }
      }
        if(count==1){
          System.out.println(" in "+word+" '"+ chArray[i] +"' is first non repeating ");
          return;
        }
    }
    System.out.println(" in "+word+" nil character is non repeating ");
  }  
}

