public class MethodDemos
{
    public static double pythagoras(double adj, double opp)
    {
        double hyp = 0.0;
        hyp = Math.sqrt(adj*adj + opp*opp);
        return hyp;
    }
    public static boolean isDivisible(int m, int n)
    {
        if (m%n == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static double simpleInterest(double balance, double rate, int years)
    {
        double amount = 0.0;
        amount = balance * Math.pow((1+rate), years);
        return amount;
    }
    public static double quadratic(int a, int b, int c)
    {
        double root1 = 0.0;
        double root2 = 0.0;
        double determinant = 0.0;
        determinant = b*b - 4*a*c;
        root1 = (-b + Math.sqrt(determinant))/2*a;
        root2 = (-b - Math.sqrt(determinant))/2*a;
        return root2;
    }
    public static void main(String[] args)
    {
        double hypotenuse = 0.0;
        hypotenuse = pythagoras(10.0, 14.0);
        System.out.println("Hypotenuse = " + hypotenuse);
        
        boolean ratio = false;
        ratio = isDivisible(67432, 9);
        System.out.println("Is m divisible by n: " + ratio);
        
        double money = 0.0;
        money = simpleInterest(100000.0, 0.05, 10);
        System.out.println("Money: " + money);
        
        double zero1 = 0.0;
        zero1 = quadratic(1, -5, 6);
        System.out.println("Roots: " + zero1);
    }
    
    
}