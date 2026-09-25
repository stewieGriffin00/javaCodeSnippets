import java.util.Arrays;
class CountNumbers{
     public static void main(String[] args){
		int temp = 0;
		int[] arr1 = { 0, 2, 3, 0, 2, 1, 5, 0 };
				// 0 1  2  3  4  5  6  7        	
		int[] e= new int[1];   //  {0};
              
		for(int i=0; i<arr1.length-1; i++){
			int count= 1;
			if(e.length>1){
				for(int k=0; k< e.length; k++){
					if(e[k] == arr1[i]){
						continue;
					}	
				}
			}

			for(int j= 1; j< arr1.length; j++){     
				if(arr1[i] == arr1[j]){
					count++;
				}
	
				if(j == arr1.length-1){
					System.out.println( arr1[i] +" count  "+ count);	
					e[temp] = arr1[i];
					temp++;
					e = Arrays.copyOf(e,e.length+1);
				}	    
			}
		}
    }
}