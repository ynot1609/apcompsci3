public class Student extends Person
{
    // instance variables
    private String ID;
    private int classification;
    
    // constructors
    public Student(String n, String a, String p, String id, int c)
    {
        super(n, a, p);
        ID = id;
        classification = c;
    }
    
    // accessor methods
    public String getID()
    {
        return ID;
    }
    
    public int getClassification()
    {
        return classification;
    }
    
    public String getFirstLetterOfAddress()
    {
        return super.getAddress().substring(0,1);
    }
    
    public String toString()
    {
        String result = "";
        result += super.toString() + "\n";
        result += "ID: " + ID + "\n";
        result += "classification: " + classification + "\n";
        return result;
    }
}