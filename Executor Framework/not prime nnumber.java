

class Main {

    public static void main(String[] args) {
        
        int n= 100;
        int count= 0;
        for(int i=2; i<= n; i++){
            if (count> 1) {
                count= 0;
                continue;
            }
            for(int j=2; j<i; j++){ 
                if(i%j == 0 && i!=j){
                    count++;
                    System.out.println(i+" is not prime ");
                    break;
                }
            }
        }        
    }
}
