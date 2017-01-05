import java.util.*;

public class WordList
{
    // instance variables
    private ArrayList<String> group;
    
    // constructors
    public WordList()
    {
        group = new ArrayList<String>();
    }
    
    // methods
    public void add(String word)
    {
        group.add(word);
    }
    
    public int numWordsOfLength(int len)
    {
        // YOUR CODE HERE
        int numWords = 0;
        for (String item : group)
        {
            if (item.length() == len)
            {
                numWords++;
            }
        }
        return numWords;
    }
    
    public void removeWordsOfLength(int len)
    {
        // YOUR CODE HERE
        for (int i = group.size()-1; i >= 0; i--)
        {
            if (group.get(i).length() == len)
            {
                group.remove(i);
            }
        }
    }
    
    public String toString()
    {
        return group.toString();
    }
}