// System.out.println();
class EqualsMethod{
    public static void main(String[] args){
        A ob1 = new A("dhoni",100,'A');
        A ob4 = new A(" MS Dhoni ",100,'A');
        A ob2 = new A("sachin",200,'B');
        A ob3 = ob1;
        System.out.println(ob1==ob2);
        System.out.println(ob1==ob3);
        ob1.name = " MS Dhoni ";
        System.out.println(ob1.name);
        System.out.println(ob3.name); // because it is shallow copy it changes the value 
        // in both objects
        System.out.println(ob1.equals(ob3));
        System.out.println(ob1.equals(ob2));
        /* we Override the equals() method in the class A. so we  get different implementation
         that is the states of each attribute is compared and we get a output in true or false,
         instead of comparing the addresses. 
         */
        System.out.println(ob1==ob2);
        System.out.println(ob1==ob3);
        /* but we still get the adddress comparision if we use the == equals operator. Even
            after Overriding the equals method.
           but usually when we haven't overrid the method we get address comparision in
           both equals operator and .equals() method. 
         */
        

        System.out.println(" lin 2 "+ob1.equals(ob4));
        System.out.println(ob1== ob4);
        /*  we get the address comparision  when we use equals operator that is why we get 
            answer as false when we compared ob1 and ob4 using equals operator.
        */
    }
}

class A{
    String name;
    char ch;
    int num;
    A(String name, int num,  char ch){
       this.name = name; 
       this.num = num;
       this.ch = ch;
    }  
    
    @Override
    public boolean equals(Object o){
        A ob = (A) o;
        return this.name==ob.name && this.num==ob.num && this.ch==ob.ch;
    }  
}