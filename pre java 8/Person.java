class Person{
    public static void main(String[] args){
        Person obj1 = new Person(45,"Dhoni");
        Person obj2 = new Person(50,"Sachin");
        System.out.println("age: "+obj1.age+" name: "+obj1.name);
        System.out.println("age: "+obj2.age+" name: "+obj2.name);
    }
    int age;
    String name;
    public Person(int age, String name){
        this.age = age;
        this.name = name;
    }
}
