class Counter{
    public static void main(String[] args){
        CounterClass ob1 = new CounterClass();
        CounterClass ob2 = new CounterClass();
        CounterClass ob3 = new CounterClass();
    }
}

class CounterClass{
    static int m = 0;
    // instace block which will be executed every time an object is created
    {
        m++;
        System.out.println(" no of objects created: "+m);
    }   
}

