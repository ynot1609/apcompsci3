public class Video
{
    // instance variables
    private String title;
    private int length;
    private boolean avail;
    
    // constructors
    public Video(String ttl)
    {
        title = ttl;
        length = 90;
        avail = true;
    }
    
    public Video(String ttl, int len)
    {
        title = ttl;
        length = len;
        avail = true;
    }
    
    public int getLength()
    {
        return length;
    }
    
    // accessor method
    public String toString()
    {
        String result = "";
        result += title + ", ";
        result += length + " min.";
        result += " available:" + avail;
        return result;
    }
}
