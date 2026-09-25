// clone method uses deep copy so that is why when we changed the word variable value to hii
// we get the hii in the next when we print the value.

class Database{
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneMethod ob1 = new CloneMethod("hello");
        CloneMethod ob2 = (CloneMethod) ob1.clone();    
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        ob2.word = "hii";
        System.out.println( ob1.toString());
        System.out.println(" after changing "+ob2.toString());
    }
}

class  CloneMethod implements Cloneable{
    String word;
    CloneMethod(String word){
        this.word = word;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override 
    public String toString(){
        return " word: "+this.word;
    }
}
