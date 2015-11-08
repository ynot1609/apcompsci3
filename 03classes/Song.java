public class Song
{
    // instance variables
    private String title;
    private String artist;
    
    // constructors
    public Song(String t, String a)
    {
        title = t;
        artist = a;
    }
    
    // accessor methods
    public String getTitle()
    {
        return title;
    }
    public String getArtist()
    {
        return artist;
    }
    // method overloading
    public boolean popularMusic()
    {
        return true;
    }
    public double popularMusic(double cost, int sales)
    {
        double revenue = 0.0;
        revenue = cost*sales;
        return revenue;
    }
    public String popularMusic(int tickets)
    {
        if (tickets > 1000)
        {
            return "Success!";
        }
        else
        {
            return "Fail!";
        }
    }
    public int popularMusic(int clicks, int accounts)
    {
        int likes = 0;
        likes = clicks*accounts;
        return likes;
    }
    public int popularMusic(int x, int y, int z)
    {
        return x+y+z;
    }
}