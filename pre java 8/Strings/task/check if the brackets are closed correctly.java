class Strings{
    public static void main(String[] args){
        final int a1  = '{';
        final int a2 = '}';
        final int b1 = '(';
        final int b2 = ')';
        final int c1 = '[';
        final int c2 = ']';

        String value = "{[[]]}";
        System.out.println("\n your string: "+ value);
        char[] valueArray = value.toCharArray();
        int valueLen = value.length();

        if(valueLen %2 != 0){
            System.out.println("\n brackets not closed correctly ");
            return;
        }

        int j, k;
        j = 0;
        k = valueLen-1;
        boolean continueNext = true;
        int o1 = 0;
        int o2 = 0;
        
        for(int i=0; continueNext && i<valueLen/2; i++){
            o1 = valueArray[j];
            o2 = valueArray[k];  
            switch(o1){
                case a1:
                    if(o2 != a2){
                        System.out.println("\n not closed");
                        continueNext = false;
                    }
                    break;

                case b1:
                    if(o2 != b2){
                        System.out.println("\n not closed");
                        continueNext = false;
                    }
                    break;

                case c1:
                    if(o2 != c2){
                        System.out.println("\n not closed");
                        continueNext = false;
                    }
                    break;

                default:
                    System.out.println("\n illegal character found");
                    continueNext = false;
                    break;
            }
            o1++;
            o2--;
        }
        if(continueNext){
            System.out.println("\n closed correctly");
        }
    }
}

