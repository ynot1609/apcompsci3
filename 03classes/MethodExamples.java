public class MethodExamples
{
    public static void mealsEaten()
    {
        System.out.println("pizza");
    }
    public static int costNoodles()
    {
        return 8;
    }
    public static double circleArea(double radius)
    {
        return 3.14*radius*radius;    
    }
    public static void main(String[] args)
    {
        // call the method
        mealsEaten();
        int cost;
        cost = costNoodles();
        System.out.println(cost);
        double area;
        area = circleArea(5.2);
        System.out.println(area);
    }
}