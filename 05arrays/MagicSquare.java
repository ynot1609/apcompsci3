public class MagicSquare
{
    public static void main(String[] args)
    {
        int size = 5;
        int num = 1;
        int row = 0;
        int col = size/2;
        int initrow = 0;
        int[][] square = new int[size][size];
        while (num < Math.pow(size,2)+1)
        {
            square[row][col] = num;
            initrow = row;
            // go up and right, else down
            if (row == 0)
                row = size-1;
            else
                row = row-1;
            col = (col+1)%size;
            if (square[row][col] != 0)
            {
                row = (initrow+1)%size;
                if (col == 0)
                    col = size-1;
                else
                    col = col-1;
            }
            num++;
        }
        // display the square
        for (int[] numrow : square)
        {
            for (int item : numrow)
            {
                System.out.print(item + "\t");
            }
            System.out.println();
        }
    }
}