
class Main{
   public static void main(String[] args){

    String k = "jaffer11";
    StringBuilder sb = new StringBuilder();

    for(char c: k.toCharArray()){
        if(!(Character.isDigit(c)))
            continue;
        sb.append(c+"");
    }
    
    int n = Integer.parseInt(sb.toString());
    System.out.println(n);
   }
}

