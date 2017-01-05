import java.util.*;
import junit.framework.JUnit4TestAdapter;
import static org.junit.Assert.assertEquals;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class WordListJUnitTest
{
    private WordList phrase;
    
    @Before
    public void runBeforeEachTest()
    {
        phrase = new WordList();
        phrase.add("cat");
        phrase.add("mouse");
        phrase.add("frog");
        phrase.add("dog");
        phrase.add("dog");
    }
    
    @After
    public void runAfterEachTest()
    {
        phrase = null;
    }
    
    @Test
    public void numWordsOfLengthTestA()
    {
        int expected = 1;
        int actual = phrase.numWordsOfLength(4);
        assertEquals(expected, actual);
    }
    
    @Test
    public void numWordsOfLengthTestB()
    {
        int expected = 3;
        int actual = phrase.numWordsOfLength(3);
        assertEquals(expected, actual);
    }
    
    @Test
    public void numWordsOfLengthTestC()
    {
        int expected = 0;
        int actual = phrase.numWordsOfLength(2);
        assertEquals(expected, actual);
    }
    
    @Test
    public void removeWordsOfLengthTestA()
    {
        phrase.removeWordsOfLength(4);
        String expected = "[cat, mouse, dog, dog]";
        String actual = phrase.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void removeWordsOfLengthTestB()
    {
        phrase.removeWordsOfLength(4);
        phrase.removeWordsOfLength(3);
        String expected = "[mouse]";
        String actual = phrase.toString();
        assertEquals(expected, actual);
    }
    
    @Test
    public void removeWordsOfLengthTestC()
    {
        phrase.removeWordsOfLength(4);
        phrase.removeWordsOfLength(3);
        phrase.removeWordsOfLength(2);
        String expected = "[mouse]";
        String actual = phrase.toString();
        assertEquals(expected, actual);
    }
}