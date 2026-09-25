import java.util.Arrays;
// this programme searches the index of all the elements inside the array 
// which is automated by a for loop passing the values you want to find to the binary search function 
class DataBase{
    public static void main(String[] args){
        System.out.println(" ");
        int[] arr = {1,3,4,6,7,9,11,13,20}; // length: 9 index: 0 to 8
                 //  0 1 2 3 4 5  6  7   8
        System.out.println(Arrays.toString(arr));      
        for(int i= 0; i<arr.length; i++){
            System.out.println(arr[i]+" "+binSearch(arr, arr[i]));
        }
    }
    static int binSearch(int[] arr, int u){
        int s= 0, e= arr.length-1;
        int m= (s+e)/2; // index: 4 element: 7
        int user = u;
        for(int i=0; i<arr.length; i++){
            m= (s+e)/2;
            if(user==arr[m]){
                return m;
            }
            else if(user>arr[m]){
                s = m+1;
            }
            else{
                e = m-1;
            }
        }
        return -1;
    }   
}

