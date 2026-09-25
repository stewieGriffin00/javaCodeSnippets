// sum of all elements
class Database{
    public static void main(String[] args){
        int[] arr1 = {1,2,5,6,4,3,2,7,8,6,5,4,7,2,2,12,5,7,8,9,6,4,3,2,4,7};
        int count = 0;
        for(int i=0; i< arr1.length; i++){
            count += arr1[i];
        }
        System.out.println(" sum of all elements: "+count);
    }
}
