
class ArrayLists{
    public static void main(String[] args){
        int[] ar1 = {1,2,3,4,5,6,7,8,9};
        int[] ar2 = {6,7,8,9,10,11,12,13,1,2};

        for(int i=0; i<ar1.length; i++){
            for(int j=0 ;j<ar2.length; j++){
                if(ar1[i] == ar2[j]){
                    System.out.println("   "+ ar1[i]);
                }
            }
        }
    }
}
