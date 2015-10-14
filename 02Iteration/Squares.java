public class Squares
{
    public static void main(String[] args)
    {
        int limit = 21;
        int sumSquares = 0;
        int sumCubes = 0;
        for (int i = 1; i <= limit; i++)
        {
            sumSquares = sumSquares + i*i;
            sumCubes = sumCubes + i*i*i;
        }
        System.out.println("Sum of squares: " + sumSquares);
        System.out.println("Sum of cubes: " + sumCubes);
    }
}