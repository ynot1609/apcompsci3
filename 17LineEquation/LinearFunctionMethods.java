public interface LinearFunctionMethods
{
    double getSlope();
    double getYintercept();

    // return the value where it crosses the x axis
    double getRoot();

    // return the y value corresponding to x
    double getYvalue(double x);

    //return the x value corresponding to y
    double getXvalue(double y);
}