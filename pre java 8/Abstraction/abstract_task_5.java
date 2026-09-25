class AbstractMain{
    public static void main(String[] args){
        BasketBallGame BasketBallGame = new BasketBallGame();
        BasketBallGame.startGame();
        BasketBallGame.endGame();
        BasketBallGame.play();
        System.out.println("_____________________\n");

        FootballGame footballGame1 = new FootballGame();
        footballGame1.startGame();
        footballGame1.endGame();
        footballGame1.play();
    }
}

abstract class Game{
    abstract void startGame();
    abstract void endGame();
    abstract void play();
}

class FootballGame extends Game{
    void startGame(){
        System.out.println(" Football game start ");
    }
    void endGame(){
        System.out.println(" Football game end ");
    }
    void play(){
        System.out.println(" 11 players trying to hit a ball inside a goal ");
    }
}

class BasketBallGame extends Game{
    void startGame(){
        System.out.println(" Salary: 40,000");
    }
    void endGame(){
        System.out.println(" Role: Developer");
    }
    void play(){
        System.out.println(" 05 players trying to dunk a ball inside a ring ");
    }
}