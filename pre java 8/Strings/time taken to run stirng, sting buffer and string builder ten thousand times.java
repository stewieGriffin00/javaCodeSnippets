// 

class Strings{
    public static void main(String[] args){
        String name1 = "";
        long start, end;
        start = System.nanoTime();
        for(int i=0; i<10000; i++){
            name1 = name1.concat(i+" ");
        }
        end = System.nanoTime();
        System.out.println(" string "+(end-start));

        StringBuilder nameSb = new StringBuilder();
        start = System.nanoTime();
        for(int i=0; i<10000; i++){
            nameSb.append(i+" ");
        }
        end = System.nanoTime();
        System.out.println(" string builder "+(end-start));
        
        StringBuffer nameSbuffer = new StringBuffer();
        start = System.nanoTime();
        for(int i=0; i<10000; i++){
            nameSbuffer.append(i+" ");
        }
        end = System.nanoTime();
        System.out.println(" string buffer "+(end-start));
    }
}