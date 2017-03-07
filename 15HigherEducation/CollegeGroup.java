import java.util.*;

public class CollegeGroup
{
    // instance variables
    private ArrayList<College> myColleges;
    
    // constructors
    public CollegeGroup()
    {
        myColleges = new ArrayList<College>();
    }
    
    public void updateTuition(String collegeName, int newTuition)
    {
        // YOUR CODE HERE
        for (College item : myColleges)
        {
            if (item.getName().equals(collegeName))
            {
                item.setTuition(newTuition);
            }
        }
    }
    
    public ArrayList<College> getCollegeList(String region, int low, int high)
    {
        // YOUR CODE HERE
        ArrayList<College> schools = new ArrayList<College>();
        for (College item : myColleges)
        {
            if (item.getRegion().equals(region) && item.getTuition() >= low && item.getTuition() <= high)
            {
                schools.add(item);
            }
        }
        return schools;
    }
    
    public void addCollege(College c)
    {
        myColleges.add(c);
    }
    
    public ArrayList<College> getColleges()
    {
        return myColleges;
    }
}