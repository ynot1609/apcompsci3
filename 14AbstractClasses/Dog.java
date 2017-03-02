public class Dog extends Pet
{
    // instance variables
    private int weight;
    
    // constructors
    public Dog(String n, int w)
    {
        super(n);
        weight = w;
    }
    
    // accessor methods
    public int getWeight()
    {
        return weight;
    }
    
    public String toString()
    {
        String result = "";
        result += super.toString() + "\n";
        result += "is a dog.\n";
        result += "weight: " + weight + "\n";
        return result;
    }
    
    public String speak()
    {
        return "woof";
    }
    
    public String move()
    {
        return "run";
    }
}