public class Team
{
    // instance variables
    private Player[] roster;
    
    // constructors
    public Team()
    {
        roster = new Player[5];
    }
    
    // mutator methods
    public void addPlayers(int i, Player p)
    {
        roster[i] = p;
    }
    
    // toString() method
    public String toString()
    {
        String result = "";
        for (int i = 0; i < roster.length; i++)
        {
            if (roster[i] != null)
            {
                result += "Name: " + roster[i].getPlayerName() + "\n";
                result += "FT %: " + roster[i].getFTPercentage();
            }
        }
        return result;
    }
}