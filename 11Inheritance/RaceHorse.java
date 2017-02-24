public class RaceHorse extends Horse
{
    // instance variables
    private int numRacesWon;
    
    // constructors
    public RaceHorse()
    {
        super();
        numRacesWon = 0;
    }
    
    public RaceHorse(String h, int a, double v, int n)
    {
        super(h, a, v);
        numRacesWon = n;
    }
    
    // accessor methods
    public int getRacesWon()
    {
        return numRacesWon;
    }
    
    // mutator methods
    public void wonRace()
    {
        numRacesWon++;
    }
    
    // toString method
    public String toString()
    {
        String result = "";
        result += super.toString();
        result += "Number of races won: " + numRacesWon + "\n";
        return result;
    }
}