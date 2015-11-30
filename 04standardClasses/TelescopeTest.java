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
        
        String tvariables = "";
        tvariables = t.toString();
        System.out.println(tvariables);
        
        Telescope t1 = new Telescope(4.0, 8.5, 0.9);
        System.out.println(t1);
        Telescope t2 = t1;
        Telescope t3 = new Telescope(5.2, 12.3, 1.7);
        
        // check if t1 and t2 refer to the same object
        boolean checkSame = false;
        checkSame = t1.equals(t2);
        System.out.println("Are t1 and t2 same?" + checkSame);
        
        checkSame = t1.equals(t3);
        System.out.println("Are t1 and t3 same?" + checkSame);
        
        
        
        
        
    }
}