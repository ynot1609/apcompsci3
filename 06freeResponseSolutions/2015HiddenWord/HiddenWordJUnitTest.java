import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class HiddenWordJUnitTest
{
    HiddenWord puzzle = new HiddenWord("HARPS");
    
    @Test
    public void evaluateOneGetHint()
    {
        String expected = "+A+++";
        String actual = puzzle.getHint("AAAAA");
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateTwoGetHint()
    {
        String expected = "H****";
        String actual = puzzle.getHint("HELLO");
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateThreeGetHint()
    {
        String expected = "H*++*";
        String actual = puzzle.getHint("HEART");
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateFourGetHint()
    {
        String expected = "HAR*S";
        String actual = puzzle.getHint("HARMS");
        assertEquals(expected, actual);
    }
    
    @Test
    public void evaluateFiveGetHint()
    {
        String expected = "HARPS";
        String actual = puzzle.getHint("HARPS");
        assertEquals(expected, actual);
    }
}