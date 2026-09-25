import java.util.Arrays;

class Main{
    public static void main(String[] args){
        Names names3 = new Names("coutry");
        Names names1 = new Names("entertainment");
        Names names4 = new Names("house");
        Names names2 = new Names("telephone");

        Names[] names = {names1,names2, names3, names4};
        System.out.println(Arrays.toString(names));

        Arrays.sort(names);
        System.out.println(Arrays.toString(names));
    }
}

class Names implements Comparable<Names>{
    String v;
    int length;
    Names(String v){
        this.v = v;
        this.length = v.length();
    }
    @Override
    public int compareTo(Names n1){
        return this.length - n1.length;
    }
    @Override
    public String toString(){
        return v;
    }
}
