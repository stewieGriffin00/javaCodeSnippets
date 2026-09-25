class Strings{
    public static void main(String[] args){
      int[] arr1 = {9,6,3,6,3,1}; // 12, 32, 34, 45, 65, 76, 99 
      int tempp = 0;
      for(int i=0 ; i<arr1.length; i++){
        for(int j=0 ; j<arr1.length-1; j++){
          for(int k: arr1){
            System.out.print(k+" ");
          }
          System.out.println();
            if(arr1[j]>arr1[j+1]){
                tempp = arr1[j];
                arr1[j] = arr1[j+1];
                arr1[j+1] = tempp;
            }   
        }
      }
      for(int k: arr1){
        System.out.println(k);
      }
    }  
}

