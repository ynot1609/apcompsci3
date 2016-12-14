import java.util.*;

public class Autoboxing
{
    public static void main(String[] args)
    {
        ArrayList<Double> scores = new ArrayList<Double>();
        scores.add(32.4);
        scores.add(87.2);
        scores.add(65.3);
        
        for (int i = 0; i < scores.size(); i++)
        {
            double value = scores.get(i);
            System.out.println(value);
        }
        
        ArrayList<Integer> nums = new ArrayList<Integer>();
        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(3);
        
        for (int i = 0; i < nums.size(); i++)
        {
            int item = nums.get(i);
            System.out.println(item);
        }
        
    }
}




