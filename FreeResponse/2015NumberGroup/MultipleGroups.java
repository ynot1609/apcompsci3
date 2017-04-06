import java.util.*;

public class MultipleGroups implements NumberGroup
{
    private ArrayList<NumberGroup> groupList;
    
    public MultipleGroups()
    {
        groupList = new ArrayList<NumberGroup>();
    }
    
    public void addGroup(NumberGroup ng)
    {
        groupList.add(ng);
    }
    
    public boolean contains(int num)
    {
        // YOUR CODE HERE
        
    }
}