public class Trail
{
    private int[] markers;

    public Trail()
    {
        markers = new int[] {100,150,105,120,90,80,50,75,75,70,80,90,100};
    }

    // Determines if a trail segment is level.
    public boolean isLevelTrailSegment(int start, int end)
    {
        // YOUR CODE HERE
        int maxElevation = 0;
        int minElevation = markers[start];
        
        for (int i = start; i <= end; i++)
        {
            if (markers[i] > maxElevation)
            {
                maxElevation = markers[i];
            }
            if (markers[i] < minElevation)
            {
                minElevation = markers[i];
            }
        }
        if ((maxElevation - minElevation) <= 10)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isDifficult()
    {
        // YOUR CODE HERE
        int elevationChange = 0;
        for (int i = 1; i < markers.length; i++)
        {
            if (Math.abs(markers[i] - markers[i-1]) >= 30)
            {
                elevationChange++;
            }
        }
        if (elevationChange >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}


