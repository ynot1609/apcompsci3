public class BPLesson34
{
    public static void main(String[] args)
    {
        // 1.
        int[][] a = {   {5, -16, 9, 21},
                        {22, 19, -101, 36},
                        {18, 17, 64, -2} };
        // 2.
        System.out.println(a[1][2]);
        // 3.
        System.out.println(a.length);
        // 5.
        System.out.println(a[2].length);
        // 6.
        System.out.println(a[1][3]);
        // 7.
        for (int row = 0 ; row < a.length; row++)
        {
            for (int col = 0; col < a[row].length; col++)
            {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
        
        // 7.
        for (int row = 0 ; row < a.length; row++)
        {
            for (int col = 0; col < a[row].length; col++)
            {
                a[row][col] = row * col;
            }
        }
        
        // 7.
        for (int row = 0 ; row < a.length; row++)
        {
            for (int col = 0; col < a[row].length; col++)
            {
                System.out.print(a[row][col] + "\t");
            }
            System.out.println();
        }
        
    }
}