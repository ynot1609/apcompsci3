public class Horse
{
    // instance variables
    private String handler;
    private int age;
    private double value;
    
    // constructors
    public Horse()
    {
        handler = "";
        age = 0;
        value = 0;
    }
    
    public Horse(String h, int a, double v)
    {
        handler = h;
        age = a;
        value = v;
    }
    
    public String toString()
    {
        String result = "";
        result += "Handler: " + handler + "\n";
        result += "Age: " + age + "\n";
        result += "Value: " + value + "\n";
        return result;
    }
}