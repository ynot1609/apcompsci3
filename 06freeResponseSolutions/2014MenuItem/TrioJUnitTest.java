import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TrioJUnitTest
{
    Sandwich sandwich1 = new Sandwich("Cheeseburger", 2.75);
    Salad salad1 = new Salad("Spinach Salad", 1.25);
    Drink drink1 = new Drink("Orange Soda", 1.25);    
    Trio trio1 = new Trio(sandwich1, salad1, drink1);

    Sandwich sandwich2 = new Sandwich("Club Sandwich", 2.75);
    Salad salad2 = new Salad("Coleslaw", 1.25);
    Drink drink2 = new Drink("Cappuccino", 3.50);    
    Trio trio2 = new Trio(sandwich2, salad2, drink2);
    
    @Test
    public void evaluateOneTrioName()
    {
        String expected = "Cheeseburger/Spinach Salad/Orange Soda Trio";
        String actual = trio1.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateOneTrioPrice()
    {
        double expected = 4.0;
        double actual = trio1.getPrice();
        assertEquals(expected, actual, 0.01);
    }
    
    @Test
    public void evaluateTwoTrioName()
    {
        String expected = "Club Sandwich/Coleslaw/Cappuccino Trio";
        String actual = trio2.getName();
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateTwoTrioPrice()
    {
        double expected = 6.25;
        double actual = trio2.getPrice();
        assertEquals(expected, actual, 0.01);
    }
}