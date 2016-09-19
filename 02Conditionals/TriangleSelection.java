public class TriangleSelection
{
    public static String displayTriangle(int opp, int adj, int hyp)
    {
        String result = "";
        if (opp == hyp && opp == adj && hyp == adj)
        {
            result = "equilateral";
        }
        else if (opp == hyp || opp == adj || hyp == adj)
        {
            result = "isosceles";
        }
        else
        {
            result = "scalene";
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        System.out.println(displayTriangle(4, 4, 4));
        System.out.println(displayTriangle(3, 4, 4));
        System.out.println(displayTriangle(3, 4, 5));
    }
}