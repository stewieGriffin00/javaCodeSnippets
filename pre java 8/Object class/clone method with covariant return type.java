class Database{
    public static void main(String[] args) throws CloneNotSupportedException{
        CloneMethod ob1 = new CloneMethod(100,"hello");
        CloneMethod ob2 = /* (CloneMethod) */ ob1.clone();
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }
}

class  CloneMethod implements Cloneable{
    int number;
    String word;
    CloneMethod(int number, String word){
        this.number = number;
        this.word = word;
    }
    @Override
    public CloneMethod clone() throws CloneNotSupportedException{
        return (CloneMethod)super.clone();
    }

    @Override 
    public String toString(){
        return "word: "+word+" number: "+number;
    }
}