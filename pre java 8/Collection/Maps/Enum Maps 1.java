import java.util.EnumMap;

class EnumMaps{
    public static void main(String[] args){
        EnumMap<Months, String> enum_Maps_1 = new EnumMap<Months, String>(Months.class);
        enum_Maps_1.put(Months.jan," jan value");       
        enum_Maps_1.put(Months.feb," feb value");       
        enum_Maps_1.put(Months.mar," mar value");       
        enum_Maps_1.put(Months.jan," jan value 2");
        System.out.println(enum_Maps_1);       
    }
}

enum Months{
    jan, feb, mar, apr, may, june;
}

/*      enum maps does not allow same enum key it will override if we enter a duplicate key.
    that is why when we entered jan it was replaced with "jan value 2" instead in the end. 
 */