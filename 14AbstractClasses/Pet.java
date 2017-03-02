public abstract class Pet
{
    // instance variables
    private String name;
    
    // constructors
    public Pet(String n)
    {
        name = n;
    }
    
    // accessor methods
    public String getName()
    {
        return name;
    }
    
    public String toString()
    {
        return "pet: " + name;
    }
    
    // abstract methods
    public abstract String speak();
    public abstract String move();
}