public class Extraction
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
        
        // Extract the first character
        String w = fruit.substring(0, 1);
        System.out.println(w);
        
        // Extract the last character
        String x = fruit.substring(9, 10);
        System.out.println(x);
        
        String z = fruit.substring(9);
        System.out.println(z);
        
        // We want to turn the inital "s" in
        // "strawberry" to an uppercase "S"
        
        String uc = "S" + fruit.substring(1, 10);
        System.out.println(uc);
        
        String ud = "S" + fruit.substring(1);
        System.out.println(ud);
        
        String ue = "S" + fruit.substring(1, fruit.length());
        System.out.println(ue);
    }
}