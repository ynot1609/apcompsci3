public class Player
{
    // instance variables
    private String playerName;
    private int freesMade;
    private int freesAttempted;
    
    // constructors
    public Player(String p, int m, int a)
    {
        playerName = p;
        freesMade = m;
        freesAttempted = a;
    }
    
    // accessor methods
    public String getPlayerName()
    {
        return playerName;
    }
    
    public int getFreesMade()
    {
        return freesMade;
    }
    
    public int getFreesAttempted()
    {
        return freesAttempted;
    }
    
    public double getFTPercentage()
    {
        double FTPercentage;
        FTPercentage = 100.0 * freesMade / freesAttempted;
        return FTPercentage;
    }
}