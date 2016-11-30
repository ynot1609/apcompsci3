public class TeamTest
{
    public static void main(String[] args)
    {
        Player jordan = new Player("Michael Jordan", 34, 54);
        Team bulls = new Team();
        bulls.addPlayers(0, jordan);
        System.out.println(bulls);
    }
}