// P p
class AnimalMAin{
    public static void main(String[] args){
        Lion lion1 = new Lion();
        lion1.makeSound();
        Cat cat1 = new Cat();
        cat1.makeSound();
        Dog dog1 = new Dog();
        dog1.makeSound();        
    }
}

class Animal{
    void makeSound(){
        System.out.println(" all animals produce sound  ")
    }
}

class Lion extends Animal{
    void makeSound(){
        System.out.println(" Lion produces roar sound ")
    }
}

class Dog extends Animal{
    void makeSound(){
        System.out.println(" Dog produces bark sound ")
    }
}

class Cat extends Animal{
    void makeSound(){
        System.out.println(" cat poduces meow sound  ")
    }
}

