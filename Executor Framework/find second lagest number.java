import java.util.Arrays;

class Main{
    public static void main(String[] args){
        int[] arr = {10, 20, 5, 1, 34, 32};

        int largest, secondLargest; 

        largest= Integer.MIN_VALUE;
        secondLargest= Integer.MIN_VALUE;

        for(int num: arr){
            // System.out.println(num);
            if(num> largest){
                secondLargest = largest;
                largest= num;
            }

            else if(num> secondLargest && num!= largest){
                secondLargest= num;
            }

        }
        System.out.println(secondLargest);
    }
}