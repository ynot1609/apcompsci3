public class Die
{
    // instance variables
    private int faceValue;
    
    // constructor
    public Die()
    {
        faceValue = 1;
    }
    
    // methods
    public void roll()
    {
        faceValue = (int) (Math.random() * 6) + 1;
    }
    
    public int getFaceValue()
    {
        return faceValue;
    }
}