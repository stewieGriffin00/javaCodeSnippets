// clone method uses deep copy so that is why when we changed the word variable value to hii
// we get the hii in the next when we print the value.
// when we use the clone method in the same  class whose object we want to clone we can  
// do it without overriding the clone method.

class Database implements Cloneable{
    String word;
    Database(String word){
        this.word = word;
    }
   
    // @Override
    // public Object clone() throws CloneNotSupportedException{
    //     return super.clone();
    // }

    @Override 
    public String toString(){
        return " word: "+this.word;
    }

    public static void main(String[] args){
        Database ob1 = new Database("hello");
        Database ob2 = null;
        try{
            ob2 = (Database) ob1.clone();
        }
        catch(CloneNotSupportedException ce){
            Thread.dumpStack();
        }
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        ob2.word = "hii";
        System.out.println( ob1.toString());
        System.out.println(" after changing "+ob2.toString());
    }
}

