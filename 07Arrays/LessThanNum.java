public class LessThanNum
{
    public static void main(String[] args)
    {
        int[][] nums = new int[3][4];
        
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
        
        
        System.out.println("Numbers less than 50");
        System.out.println("Row Col");
        
        for (int row = 0; row < nums.length; row++)
        {
            for (int col = 0; col < nums[0].length; col++)
            {
                if (nums[row][col] < 50)
                {
                    System.out.print(row + "   ");
                    System.out.println(col);
                }
            }
        }
        
        
        
        
        
        
        
        
    }
}