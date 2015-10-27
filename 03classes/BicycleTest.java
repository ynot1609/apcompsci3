public class BicycleTest
{
    public static void main(String[] args)
    {
        Bicycle b1 = new Bicycle();
        System.out.println(b1.getSpeed());
        System.out.println(b1.getGear());
        
        Bicycle b2 = new Bicycle(8, 3);
        System.out.println(b2.getSpeed());
        System.out.println(b2.getGear());
    }
}