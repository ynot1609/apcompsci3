public class MultipleGroupsTest
{
    public static void main(String[] args)
    {
        MultipleGroups multiple1 = new MultipleGroups();
        multiple1.addGroup(new Range(5, 8));
        multiple1.addGroup(new Range(10, 12));
        multiple1.addGroup(new Range(1, 6));
        
        System.out.println(multiple1.contains(2));
        System.out.println(multiple1.contains(9));
        System.out.println(multiple1.contains(6));
    }
}