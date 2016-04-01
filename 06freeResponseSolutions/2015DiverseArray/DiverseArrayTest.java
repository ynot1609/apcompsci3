public class DiverseArrayTest
{
    public static void main(String[] args)
    {
        // Part a)
        int[] arr1 = {1,3,2,7,3};
        int linear = DiverseArray.arraySum(arr1);
        System.out.println("1-D sum = " + linear);
        
        // Part b)
        int[][] mat1 = { {1,3,2,7,3},
                        {10,10,4,6,2},
                        {5,3,5,9,6},
                        {7,6,4,2,1} };
        int[] vector = DiverseArray.rowSums(mat1);
        System.out.print("2-D sum = ");
        for (int item : vector)
        {
            System.out.print(item + " ");
        }
        
        // Part c)
        int[][] mat2 = { {1,1,5,3,4},
                        {12,7,6,1,9},
                        {8,11,10,2,5},
                        {3,2,3,0,6} };
        boolean unique = DiverseArray.isDiverse(mat1);
        System.out.println();
        System.out.println("Is mat1 unique? " + unique);
        unique = DiverseArray.isDiverse(mat2);
        System.out.println("Is mat2 unique? " + unique);
    }
}