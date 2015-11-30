public class ArrayExercises
{
    public static void main(String[] args)
    {
        // 1.
        double[] sgt = new double[800];
        
        // 2.
        double[] dfw = new double[21];
        System.out.println(dfw.length);
        
        // 3.
        for (int i = 0; i < sgt.length; i++)
        {
            sgt[i] = Math.sqrt(i);
        }
        for (double item : sgt)
        {
            System.out.println(item);
        }
        
        // 7.
        int total = 0;
        int[] ref = {2, 6, 9, 10, 15};
        for (int item : ref)
        {
            total += Math.pow(item, 2);
        }
        System.out.println("Total = " + total);
        
    }
}