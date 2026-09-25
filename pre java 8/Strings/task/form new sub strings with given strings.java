class Strings{
    public static void main(String[] args){
        String value = "ABC";
        StringBuilder sb = new StringBuilder();

        for(int i= 0; i<value.length(); i++){
            sb.delete(0, sb.length()); 
            for(int j= i; j<value.length(); j++){
                sb.append(value.charAt(j)+"");
                System.out.println(sb);
            }
        }
    }
}

