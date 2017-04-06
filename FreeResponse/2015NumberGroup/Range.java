public class Range implements NumberGroup
{
    // YOUR CODE HERE
    
    
    public String toString()
    {
        String result = "";
        for (int item : group)
        {
            result += item + " ";
        }
        return result;
    }
}
