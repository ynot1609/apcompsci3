public class Range implements NumberGroup
{
    // YOUR CODE HERE
    private int minimum;
    private int maximum;
    private int[] group;
    
    public Range(int min, int max)
    {
        minimum = min;
        maximum = max;
        int size = max-min+1;
        group = new int[size];
        for (int i = 0; i < group.length; i++)
        {
            group[i] = min;
            min++;
        }
    }
    
    public boolean contains(int num)
    {
        for (int item : group)
        {
            if (item == num)
            {
                return true;
            }
        }
        return false;
    }
    
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
