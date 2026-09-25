class Strings{
    public static void main(String[] args){
        String value = "xyz";
        int len = value.length(), k=0;

        for(int i= 0; i<len; i++){
            for(int j= 0; j<len; j++){
                if(i == j){
                    continue;
                }
                k = len -(i+j);
                // System.out.println(" i: "+i+" j: "+j+" k: "+k);
                System.out.println(value.charAt(i)+""+value.charAt(j)+""+value.charAt(k));
            }
        }
    }
}

