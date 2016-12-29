import java.util.*;

public class RemoveIntegers
{
    public static void main(String[] args)
    {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(9);
        list.add(3);
        list.add(5);
        list.add(2);
        list.add(6);
        list.add(4);
        list.add(8);
        list.add(1);
        System.out.println(list);
        // remove evens
        for (int i = list.size()-1; i >= 0; i--)
        {
            if (list.get(i)%2 == 0)
            {
                list.remove(i);
            }
        }
        System.out.println(list);
    }
}