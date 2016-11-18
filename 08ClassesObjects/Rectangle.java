public class Rectangle
{
    // instance variables
    private int length;
    private int width;
    
    // constructors
    public Rectangle(int len, int wid)
    {
        length = len;
        width = wid;
    }
    
    // accessor methods
    public int getLength()
    {
        return length;
    }
    
    public int getWidth()
    {
        return width;
    }
    
    public int getPerimeter()
    {
        return 2*length + 2*width;
    }
    
    public int getArea()
    {
        return length*width;
    }
    
    // mutator methods
    public void setLength(int len)
    {
        length = len;
    }
    
    public void setWidth(int wid)
    {
        width = wid;
    }
    
    // toString() method
    public String toString()
    {
        String result = "";
        result += "Length = " + length + "\n";
        result += "Width = " + width + "\n";
        result += "Perimeter = " + getPerimeter() + "\n";
        result += "Area = " + getArea() + "\n";
        return result;
    }
}