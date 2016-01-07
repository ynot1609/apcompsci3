//----------------------------------------------------------
// File Name:	Trail.java
// Description:	Provides trail markers, elevation, and methods
//              to determine if the trail is level, or difficult
// Programmer:	Alwin Tareen
// Last Edited:	Dec 19, 2014
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac Trail.java
// Execution:	<non-executable>
//----------------------------------------------------------

public class Trail
{
    private int[] markers = {100,150,105,120,90,80,50,75,75,70,80,90,100};

    public Trail()
    {
        // empty
    }

    // Determines if a trail segment is level.
    public boolean isLevelTrailSegment(int start, int end)
    {
        int maxElevation = markers[start];
        int minElevation = markers[start];
        
        for (int i = start; i <= end; i++)
        {
            if (markers[i] > maxElevation)
                maxElevation = markers[i];
            if (markers[i] < minElevation)
                minElevation = markers[i];
        }
        
        if ((maxElevation - minElevation) <= 10)
            return true;
        else
            return false;
    }
    
    public boolean isDifficult()
    {
        int elevationChange = 0;
        for (int i = 1; i < markers.length; i++)
        {
            if (Math.abs(markers[i] - markers[i-1]) >= 30)
                elevationChange++;
        }
        
        if (elevationChange >= 3)
            return true;
        else
            return false;
    }
}


