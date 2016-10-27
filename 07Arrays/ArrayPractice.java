public class ArrayPractice
{
    public static void main(String[] args)
    {
        int[] nums = new int[5];
        nums[0] = 2;
        nums[1] = 4;
        nums[2] = 6;
        nums[3] = 8;
        nums[4] = 10;
        
        int[] evens = new int[5];
        
        for (int i = 0; i < evens.length; i++)
        {
            evens[i] = i*2 + 2;
        }
        
        for (int i = 0; i < evens.length; i++)
        {
            System.out.println(evens[i]);
        }
        
        int[] tens = {10, 20, 30, 40, 50};
        for (int i = 0; i < tens.length; i++)
        {
            System.out.println(tens[i]);
        }
        
        double[] scores = new double[4];
        scores[0] = 5.6;
        scores[1] = 9.9;
        for (int i = 0; i < scores.length; i++)
        {
            System.out.println(scores[i]);
        }
        
        String[] pets = new String[3];
        pets[0] = "Dog";
        pets[2] = "Cat";
        for (int i = 0; i < pets.length; i++)
        {
            System.out.println(pets[i]);
        }
    }
}

