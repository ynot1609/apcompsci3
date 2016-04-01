public class Bird implements FlyingObject
{
    // instance variables
    private int airspeed;
    private int wingspan;
    
    // constructors
    public Bird()
    {
        airspeed = 0;
        wingspan = 8;
    }
    
    // abstract methods overridden
    public void fly()
    {
        System.out.println("Flap, Flap!");
    }
    
    public boolean isFlying()
    {
        return true;
    }
}