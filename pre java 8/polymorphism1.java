 class Polymorphism{
    public static void main(String[] args){
        System.out.println(" method Overriding ");
        Vehicle vehicle1 = new Vehicle();
        vehicle1.purpose();
        Car car1 = new Car();
        car1.purpose();
        Bike bike1 = new Bike();
        bike1.purpose();
        System.out.println("++++++++++\n"+" changing variable variable ");
        System.out.println(" price\n bike: "+bike1.price+"\n car: "+car1.price+"\n vehicle: "+vehicle1.price);
        System.out.println(vehicle1.buyingCriteria(15,100));
        System.out.println(vehicle1.buyingCriteria(18,10000000));
        System.out.println(vehicle1.buyingCriteria(18,99));
        System.out.println(car1.buyingCriteria(15,100));
        System.out.println(car1.buyingCriteria(18,3000000));
        System.out.println(car1.buyingCriteria(18,10));
        System.out.println(bike1.buyingCriteria(15,100));
        System.out.println(bike1.buyingCriteria(18,200000));
        System.out.println(bike1.buyingCriteria(18,2000));
    } 
}

class Vehicle{
    int price = 5000000;
    void purpose(){
        System.out.println(" travelling to other places ");
    }
    String buyingCriteria(int age, int accountBalance){
        return age>=18?accountBalance>=10000000?"you can buy vehicle thankyou":" you cannot buy vehicle  money is less":" you cannot buy vehicle  age is less";
    }
}

class Car extends Vehicle{
    int price = 2000000;
    @Override
    void purpose(){
        System.out.println(" has four wheels ");
    }
    @Override
     String buyingCriteria(int age, int accountBalance){
        return age>=18?accountBalance>=2000000?"you can buy car thankyou":" you cannot buy car  money is less":" you cannot buy car  age is less";
    }
}

class Bike extends Vehicle{
    int price = 100000;
    @Override
    void purpose(){
        System.out.println(" has two wheels ");
    }
    @Override
     String buyingCriteria(int age, int accountBalance){
        return age>=18?accountBalance>=100000?"you can buy bike thankyou":" you cannot buy bike  money is less":" you cannot buy bike  age is less";
    }
}