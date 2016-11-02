public class Transpose
{
    public static void main(String[] args)
    {
        int[][] nums = new int[5][5];
        int[][] transpose = new int[5][5];
        
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[0].length; col++)
            {
                nums[row][col] = (int)(Math.random()*100);
            }
        }
        
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[0].length; col++)
            {
                System.out.print(nums[row][col] + " ");
            }
            System.out.println();
        }
        
        System.out.println("Transpose");
        
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[0].length; col++)
            {
                transpose[col][row] = nums[row][col];
            }
        }
        
        for (int row = 0; row < transpose.length; row++)
        {
            for (int col = 0; col < transpose[0].length; col++)
            {
                System.out.print(transpose[row][col] + " ");
            }
            System.out.println();
        }
        
        
        
        
        
        
    }
}