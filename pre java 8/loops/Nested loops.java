import java.util.Scanner;
class Database{
    public static void main(String[] args){
        //  System.out.println();
        // for(int i=1; i<4; i++){
        //     System.out.println(" i: "+i+"\n-----");
        //     for(int j= 1; j<4; j++){
        //         // if(i == 3){
        //         //     break;
        //         // }
        //         // if(j == 3){
        //         //     break;
        //         // }
        //         System.out.println(" j: "+j);
        //     }
        //     System.out.println("------");
        // }
        for(int i = 1; i<4; i++){
            System.out.println(" i: "+i+"\n---------");
            for(int j= 1; j<4; j++){
                System.out.println("    j: "+j+"\n---------");
                for(int k= 1; k<4; k++){
                    /* if(k == 3 && j == 1){
                        break;
                    } */
                    /* if(k == 2){
                        break;
                    } */
                    /* if(i == 3){
                        break;
                    } */
                    break;
                    // System.out.println("        k: "+k);
                }
            }
        }
    }
}
/*  Break Statement inside the Nested loops:
        the break statement does not break out of all the loops as I used to 
        think earlier. Instead it can be controlled which loop only breaks off.
        If there are three loops i, j, k in the order of there nesting 
        if I give the condition that if k is reached to a certain break the loop 
        then only the k loop will be terminated.
        If I give the condition to be that if the certain iteration is 
        met by the j and k loop both the j and k loop will be terminated and 
        the programme will come out to the i loop.
        In a nutshell:
            1. the loop which contains the break statement will have a condition,
            the loop which is mentioned in the condition will be terminated.
            As a result all the inner loops of that mentioned loops will also be 
            terminated.
            2. the loop which has the break statement will be terminated 
 */
