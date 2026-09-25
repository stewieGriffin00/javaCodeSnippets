class NestLoop{
    public static void main(String[] args){
        for(int k=1; k<=3; k++){
            for(int i = 1;i<=3;i++){
                for(int j = 1;j<=3;j++){
                    if(i == 3 && j == 1 && k == 3){
                        System.out.println(" now loop will stop ");
                        break;
                    } 
                    System.out.println(" k: "+k+" i: "+i+" j: "+j);
                }
            }
        }
        
    }
}

