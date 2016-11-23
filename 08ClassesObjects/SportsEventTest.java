public class SportsEventTest
{
    public static void main(String[] args)
    {
        SportsEvent game = new SportsEvent();
        game.addScore(0, 9.2);
        game.addScore(1, 9.5);
        game.addScore(2, 9.5);
        game.addScore(3, 9.1);
        game.addScore(4, 9.7);
        game.addScore(5, 9.6);
        game.addScore(6, 9.7);
        game.addScore(7, 9.6);
        System.out.println(game);
    }
}