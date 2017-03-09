public class LinearFunctionTest
{
    public static void main(String[] args)
    {
        double slope = 1.5;
        double yIntc = 3;

        LinearFunction line = new LinearFunction(slope, yIntc);
        System.out.println("\nSlope of this line is: " + line.getSlope( ));
        System.out.println("Y-intercept of this line is: " + line.getYintercept( ));
        System.out.println("Root of this line is: " + line.getRoot( ));

        double x = 6;
        double yValue = line.getYvalue(x);
        System.out.println("The y value corresponding to x = " + x + " is " + yValue);

        double y = 8;
        double xValue = line.getXvalue(y);
        System.out.println("The x value corresponding to y = " + y + " is " + xValue);
    }
}