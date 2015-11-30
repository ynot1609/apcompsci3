public class MathMethods
{
    public static void main(String[] args)
    {
        // display accurate value of pi
        double pi = Math.PI;
        System.out.println(pi);
        
        int c = -32;
        System.out.println(Math.abs(c));
        
        double d = -379.22;
        System.out.println(Math.abs(d));
        
        double radius = 5.7;
        System.out.println(Math.pow(radius, 2.0));
        System.out.println(Math.pow(42.1, 3.7));
        
        double f = 2034.56;
        System.out.println(Math.sqrt(f));
        
        // Generate a random double
        double lucky = Math.random();
        System.out.println(lucky);
        
        // Area of a circle
        double r = 9.7;
        double area = Math.PI * Math.pow(r, 2.0);
        System.out.println("Area = " + area);
        
        
    }
}