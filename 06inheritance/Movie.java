public class Movie extends Video
{
    // instance variables
    private String director;
    private String rating;
    
    // constructors
    public Movie(String ttl, int len, String dir, String rate)
    {
        super(ttl, len);    // must be first statement
        director = dir;
        rating = rate;
    }
    
    public boolean isLongMovie()
    {
        if (getLength() > 120)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public String toString()
    {
        String result = "";
        result += super.toString();
        result += "dir: " + director;
        result += ", rating: " + rating;
        return result;
    }
    
}