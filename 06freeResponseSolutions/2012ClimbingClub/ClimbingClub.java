//----------------------------------------------------------
// File Name:	ClimbingClub.java
// Description:	2012 AP Free Response Question 1.
// Programmer:	Alwin Tareen
// Last Edited:	Mar 25, 2015
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac ClimbingClub.java
// Execution:	<non-executable>
//----------------------------------------------------------
import java.util.List;
import java.util.ArrayList;

public class ClimbingClub
{
    private List<ClimbInfo> climbList;

    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }

    public void addClimbParta(String peakName, int climbTime)
    {
        // YOUR CODE HERE
        ClimbInfo pickaxe = new ClimbInfo(peakName, climbTime);
        climbList.add(pickaxe);
    }

    public void addClimbPartb(String peakName, int climbTime)
    {
        // YOUR CODE HERE
        ClimbInfo harness = new ClimbInfo(peakName, climbTime);
        String insertName = harness.getName();
        String currentName = "";
        
        for (int i = 0; i < climbList.size(); i++)
        {
            currentName = climbList.get(i).getName();
            if (insertName.compareTo(currentName) <= 0)
            {
                climbList.add(i, harness);
                return;
            }
        }
        climbList.add(harness);
    }

    public int distinctPeakNames()
    {
        return 0;
    }

    public String toString()
    {
        String result = "";
        for (ClimbInfo item : climbList)
        {
            result += item.getName() + " " + item.getTime() + "\n";
        }
        return result;
    }
}


