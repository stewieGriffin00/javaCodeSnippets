class Interface{
    public static void main(String[] args){
        FootBall fb1 = new FootBall();
        BasketBall bb1 = new BasketBall();
        fb1.playerCount();
        fb1.playGround();

        bb1.playerCount();
        bb1.playGround();
    }
}

interface Games{
    public void playGround();
    public void playerCount();
}

class FootBall implements Games{
    @Override
    public void playerCount(){
        System.out.println("Football is played with 11 Players");
    }
    @Override
    public void playGround(){
        System.out.println("Football is played on grass");
    }
}

class BasketBall implements Games{
    @Override
    public void playerCount(){
        System.out.println("BasketBall is played with 5 Players");
    }
    @Override
    public void playGround(){
        System.out.println("BasketBall is played in court ");
    }
}
