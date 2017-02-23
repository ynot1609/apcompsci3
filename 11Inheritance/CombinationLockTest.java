public class CombinationLockTest
{
    public static void main(String[] args)
    {
        CombinationLock combo = new CombinationLock("123");
        
        combo.open("123");
        System.out.println(combo);
        combo.close();
        System.out.println(combo);
        
        combo.setCombination("456");
        combo.open("123");
        System.out.println(combo);
        combo.open("456");
        System.out.println(combo);
    }
}