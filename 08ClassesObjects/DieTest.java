public class DieTest
{
    public static void main(String[] args)
    {
        Die die1 = new Die();
        die1.roll();
        System.out.println(die1.getFaceValue());
    }
}