public class TrailTest
{
    public static void main(String[] args)
    {
        Trail hikingPath = new Trail();
        
        System.out.print("Level Trail? Should be true: ");
        System.out.println(hikingPath.isLevelTrailSegment(7, 10));
        
        System.out.print("Level Trail? Should be false: ");
        System.out.println(hikingPath.isLevelTrailSegment(2, 12));
        
        System.out.print("Difficult Trail? Should be true: ");
        System.out.println(hikingPath.isDifficult());
    }
}

