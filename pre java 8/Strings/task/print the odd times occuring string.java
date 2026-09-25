class Strings{
    public static void main(String[] args){
        String[] arr = {"a", "a", "b", "c","e","e", "a", "b", "b", "c", "c", "c", "d", "e"};
        int count = 0;
        for(int i = 0; i< arr.length; i++){
            count = 1;
            if(arr[i] == null){
                continue;
            }
            for(int j = i; j< arr.length; j++){
                if(i == j){
                    continue;
                }
                if(arr[i] == arr[j]){
                    count++;
                    arr[j] = null;
                }
            }
            if(count>=3 && count%2 != 0){
                System.out.println(arr[i]);
                arr[i] = null;
            }
        }   
    }
}

