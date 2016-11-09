public class Die
{
    // instance variables
    private int faceValue;
    
    // constructor
    public Die()
    {
        faceValue = 0;
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