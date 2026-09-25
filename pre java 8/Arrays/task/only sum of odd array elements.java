// only sum of odd array elements
class Database{
    public static void main(String[] args){
        int[] arr1 = {1,2,5,6,4,3,2,7,8,6,5,4,7,2,2,12,5,7,8,9,6,4,3,2,4,7};
        int count = 0;
        for(int i=0; i< arr1.length; i++){
            if(arr1[i]%2 !=  0){
                count += arr1[i];
            }
        }
        System.out.println(" addition of all odd elements: "+count);
    }
}
