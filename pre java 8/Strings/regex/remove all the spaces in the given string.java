// remove all the spaces in the given string.
class Strings{
    public static void main(String[] args){
      String word = "java   class    today    hello come please   ";
      System.out.println("with spaces "+word);
      System.out.println("without spaces "+word.replaceAll("\\s+"," "));
    }  
}

