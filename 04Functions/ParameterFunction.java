public class ParameterFunction
{
    public static double calcArea(int radius)
    {
        double area = 3.14 * radius * radius;
        return area;
    }
    
    public static void main(String[] args)
    {
        double result = calcArea(5);
        System.out.println(result);
    }
}