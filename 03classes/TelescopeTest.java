public class TelescopeTest
{
    public static void main(String[] args)
    {
        Telescope t = new Telescope(3.0, 6.5, 0.8);
        double magnify = 0.0;
        magnify = t.magnification();
        System.out.println("Magnification = " + magnify);
        
        double f = 0.0;
        f = t.fNumber();
        System.out.println("fNumber = " + f);
    }
}