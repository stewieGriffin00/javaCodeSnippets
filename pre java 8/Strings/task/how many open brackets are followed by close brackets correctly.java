class Strings{
    public static void main(String[] args){
        String s = "((()()((";
        int count=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.charAt(i)=='('){
                if(s.charAt(i+1)==')'){
                    count++;
                }
            }
        }
        System.out.println("count in "+ s+ "  is count "+ count);
    }
}

