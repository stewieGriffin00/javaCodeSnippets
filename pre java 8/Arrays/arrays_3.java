// find duplicate numbers 
 
class Database{
    public static void main(String[] args){
        int numberList[] = {1,8,3,2,4,1,2,5,3,1,2,3}; 
        for(int i =0; i<numberList.length; i++){
            boolean isUNique = false;
            for(int j=0; j<i; j++){
                if (numberList[i]==numberList[j]){
                    isUNique = true;
                    break;
                }
            }
            if(!isUNique){
                System.out.println(numberList[i]);
            }
        }
    }
}



