public class ScoreBoard
{
    public static void addOne(int[] table)
    {
        for (int i = 0; i < table.length; i++)
        {
            table[i] += 1;
        }
    }
    public static void main(String[] args)
    {
        //int[] scores = {42, 96, 84};
        int[] scores = new int[3];
        scores[0] = 42;
        scores[1] = 96;
        scores[2] = 84;
        
        addOne(scores);
        for (int item : scores)
        {
            System.out.println(item);
        }
    }
}