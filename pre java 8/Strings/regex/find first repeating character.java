// find first repeating character
class Strings{
    public static void main(String[] args){
      String word = "abcdefggthyiiiooo";
      char[] ch = word.toCharArray();
      /* for(char c: ch){
        System.out.println(c);
      } */
      int count = 0;
      for(int i=0; i<ch.length ; i++){
        count=0;
        for(int j=0; j<ch.length; j++){
          if(ch[i] == ch[j]){
            count++;
            if(count==2){
              System.out.println(" first repeating character in "+word+" is "+ch[j]);
              return;
            }
          }
        }
      }
      System.out.println(" no repeating characters ");
    }  
}

