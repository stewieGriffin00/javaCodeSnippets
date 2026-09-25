class PatternProblems{
    public static void main(String[] args){
        int m = 5;
        for(int i= 0; i< m; i++){
                for(int j= 0; j< m; j++){
                    System.out.print((i+j <= m-1)?"*":" ");
                }
            System.out.println();
        }
    }
}








