public class Assignment
{
    // instance variables
    private String name;
    private String type;
    private int score;
    
    // constructors
    public Assignment()
    {
        name = "";
        type = "";
        score = 0;
    }
    
    public Assignment(String n, String t, int s)
    {
        name = n;
        type = t;
        score = s;
    }
    
    // accessor methods
    public String getName()
    {
        return name;
    }
    
    public String getType()
    {
        return type;
    }
    
    public int getScore()
    {
        return score;
    }
    
    public String getLetterGrade()
    {
        if (score >= 90)
        {
            return "A";
        }
        else if (score >= 80)
        {
            return "B";
        }
        else
        {
            return "C";
        }
    }
    
    // mutator methods
    public void setName(String n)
    {
        name = n;
    }
    
    public void setType(String t)
    {
        type = t;
    }
    
    public void setScore(int s)
    {
        score = s;
    }
    
    // toString() method
    public String toString()
    {
        String result = "";
        result += "Type: " + type + "\n";
        result += "Name: " + name + "\n";
        result += "Score: " + score + "\n";
        result += "Letter Grade: " + getLetterGrade() + "\n";
        return result;
    }
}