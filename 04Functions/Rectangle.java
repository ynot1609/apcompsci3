public class Rectangle
{
    public static double areaRectangle(int length, int width)
    {
        return length * width;
    }
    
    public static void main(String[] args)
    {
        double result = areaRectangle(5, 8);
        System.out.println(result);
    }
    
}