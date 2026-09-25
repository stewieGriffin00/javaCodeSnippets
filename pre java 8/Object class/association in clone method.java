// Clone method in aggregation doesn't do deep copy for the variables of the associate class
// in this programme we see how the house_number variable of the address class isn't 
// modified. meanwhile the word variable of the clone method is deep copied because it belong to 
// same class.
class Database{
    public static void main(String[] args) throws CloneNotSupportedException{
        Address a = new Address(20);
        CloneMethod ob1 = new CloneMethod(a,"hello");
        CloneMethod ob2 = (CloneMethod) ob1.clone();
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        ob2.word = "hii";
        ob2.address.house_number = 98686;
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }
}

class  CloneMethod implements Cloneable{
    String word;
    Address address;
    CloneMethod(Address address, String word){
        this.address = address;
        this.word = word;
    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    @Override 
    public String toString(){
        return "word: "+word+" address.house_number: "+this.address.house_number;
    }
}

class Address{
    int house_number;
    Address(int num){
        house_number = num;
    }
}