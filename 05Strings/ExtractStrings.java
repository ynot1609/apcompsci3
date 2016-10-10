public class ExtractStrings
{
    public static void main(String[] args)
    {
        // Extract the string "straw"
        String fruit = "strawberry";
        String s = fruit.substring(0, 5);
        System.out.println(s);
        
        // Extract the string "berry"
        String u = fruit.substring(5, 10);
        System.out.println(u);
        String v = fruit.substring(5);
        System.out.println(v);
        
        // Extract the first letter
        String w = fruit.substring(0, 1);
        System.out.println(w);
        
        // Extract the last letter
        String x = fruit.substring(9, 10);
        System.out.println(x);
        String y = fruit.substring(9);
        System.out.println(y);
        
        // We want the string "strawberry" to
        // have an uppercase "S"
        String uc = "S" + fruit.substring(1, 10);
        System.out.println(uc);
        String ud = "S" + fruit.substring(1);
        System.out.println(ud);
        
    }
}