

class Main {

    public static void main(String[] args) {
        System.out.println("\n\n");

        int n=6;
        int count= 0;
        for(int i=2; i<n+1; i++){
            count= 0;
            for(int j=2; j<=i; j++){
                if(i%j== 0){
                    count++;
                }   
                if(i==j && count==1){
                    System.out.println(i+ " is prime ");
                    
                }
            }
        }
        System.out.println("\n\n");

        // System.out.println(3%2);
    }
}
