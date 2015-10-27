public class Date
{
    // instance variables
    private int month;
    private int day;
    private int year;
    
    // constructors
    public Date()
    {
        month = 1;
        day = 1;
        year = 2000;
    }
    public Date(int m, int d, int y)
    {
        month = m;
        day = d;
        year = y;
    }
    
    // accessor methods
    public int getMonth()
    {
        return month;
    }
    public int getDay()
    {
        return day;
    }
    public int getYear()
    {
        return year;
    }
    public String toString()
    {
        return month + " " + day + " " + year;
    }
    
    // mutator methods
    public void changeDate(int mn, int dt, int yr)
    {
        month = mn;
        day = dt;
        year = yr;
    }
}