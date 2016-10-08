public class ReturnFunction
{
    public static int todaysDate()
    {
        return 8;
    }
    
    public static void main(String[] args)
    {
        int result = todaysDate();
        System.out.println(result);
        // alternate method
        System.out.println(todaysDate());
    }
}