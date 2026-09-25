class DataBase{
    public static void main(String[] args){
        String input = "hello".toLowerCase();
        System.out.println(" find the first character repeating in the string");
        char temp1, temp2;
        int count;
        for(int i=0; i<input.length(); i++){
            count=0;
            for(int j= 0; j<input.length(); j++){
                if(input.charAt(i) == input.charAt(j)){
                    count++;
                }
                if(count==2){
                    System.out.println(" first repeating character: "+input.charAt(j));
                    return;
                }
            }
        }
        System.out.println(" zero repeating charactes. ");
    }
}

