public class SportsEvent
{
    // instance variables
    private double[] scores;
    
    // constructors
    public SportsEvent()
    {
        scores = new double[8];
    }
    
    public void addScore(int index, double points)
    {
        scores[index] = points;
    }
    
    public double lowest()
    {
        double minValue = Double.MAX_VALUE;
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] < minValue)
            {
                minValue = scores[i];
            }
        }
        return minValue;
    }
    
    public double highest()
    {
        double maxValue = Double.MIN_VALUE;
        for (int i = 0; i < scores.length; i++)
        {
            if (scores[i] > maxValue)
            {
                maxValue = scores[i];
            }
        }
        return maxValue;
    }
    
    public double average()
    {
        double sum = 0.0;
        for (int i = 0; i < scores.length; i++)
        {
            sum += scores[i];
        }
        sum -= lowest();
        sum -= highest();
        return sum/(scores.length-2);
    }
    
    public String toString()
    {
        String result = "";
        result += "Lowest: " + lowest() + "\n";
        result += "Highest: " + highest() + "\n";
        result += "Average: " + average();
        return result;
    }
}