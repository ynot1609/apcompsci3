public class Arithmetic
{
    public static void main(String[] args)
    {
        // declare and initialize variables
        int num1 = 20;
        int num2 = 5;
        int num3 = 2;
        int result1 = 0;
        int result2 = 0;
        int result3 = 0;
        int result4 = 0;
        
        // perform calculations
        result1 = num1 + num2 + num3;
        result2 = num1 * num2 / num3;
        result3 = (num1 + num3) / 11;
        result4 = (num1 - num2) * num3;
    
        // display results
        System.out.println("Result1 = " + result1);
        System.out.println("Result2 = " + result2);
        System.out.println("Result3 = " + result3);
        System.out.println("Result4 = " + result4);
    }
}