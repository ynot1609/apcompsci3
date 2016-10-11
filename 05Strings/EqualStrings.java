public class EqualStrings
{
    public static void main(String[] args)
    {
        // 2 Strings that are equal
        String drink = "water";
        String beverage = "water";
        boolean result = drink.equals(beverage);
        System.out.println(result);
        
        // 2 Strings that are not equal
        String soda = "sprite";
        String pop = "pepsi";
        boolean outcome = soda.equals(pop);
        System.out.println(outcome);
        
        outcome = "pizza".equals("burger");
        System.out.println(outcome);
        
        result = !soda.equals(pop);
        System.out.println(result);
        
        String number1 = "one";
    }
}