public class Pythagoras
{
    public static double calcPythagoras(double a, double b)
    {
        double aval = Math.pow(a, 2.0);
        double bval = Math.pow(b, 2.0);
        
        double c = Math.sqrt(aval+bval);
        return c;
    }
    
    public static void main(String[] args)
    {
        double result = calcPythagoras(32.5, 95.6);        
        System.out.println(result);
    }
}