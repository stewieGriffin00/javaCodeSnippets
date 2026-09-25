// P p
class SportsMain{
    public static void main(String[] args){
        Football fb1 = new Football();
        fb1.message();
        BasketBall bb1 = new BasketBall();
        bb1.message();
        Rugby rb1 = new Rugby();
        rb1.message(); 
    }
}

class Football  extends Sports{
    void message(){
        System.out.println(" Football is playd wth 11 players ");
    }
}
class BasketBall  extends Sports{
    void message(){
        System.out.println(" Basket Ball is playd wth 05 players  ");
    }
}
class Rugby extends Sports{
    void message(){
        System.out.println(" Rugby is playd wth 10 players  ");
    }
}

class Sports{
    void message(){
        System.out.println(" sports games are super ");
    }
}