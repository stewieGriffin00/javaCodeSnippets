import java.util.ArrayList;

class ArrayLists{
    public static void main(String[] args){
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("Mathi");
        al1.add("Anu");
        al1.add("Siva");
        al1.add("Baharathi");
        al1.add("Purni");
        al1.add("gajini");
        String newChar = "y";
        for(int j= 0; j<al1.size(); j++){
            String s  = al1.get(j);
            if(s.charAt(s.length()-1) == 'i'){
                int len = s.length();
                s = s.substring(0,len-1)+ newChar;
                al1.set(j,s);
            }
        }
        System.out.println(al1);
    }
}

