import java.util.WeakHashMap;

class HashTables{
    public static void main(String[] args){
        WeakHashMap<Integer, String> weakHashMap1 = new WeakHashMap<Integer, String>();
        Integer i1 = 10;
        Integer i2 = 20;
        Integer i3 = 30;

        weakHashMap1.put(i3, "Banana");
        weakHashMap1.put(i2, "Mango");
        weakHashMap1.put(i1,"Apple");

        System.out.println(weakHashMap1);
        i1 = null;
        i2 = null;
        System.gc();
        System.out.println(weakHashMap1);

    }
}