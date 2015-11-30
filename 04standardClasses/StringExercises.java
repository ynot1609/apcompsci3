public class StringExercises
{
    public static void main(String[] args)
    {
        // 1.
        String s = "The number of rabbits is ";
        int argh = 129;
        String report = s + argh;
        System.out.println(report + ".");
        
        // 2.
        String p = "Groovy Dude";
        System.out.println(p.toUpperCase());
        
        // 3.
        String g = "Computer Science";
        System.out.println(g.toLowerCase());
        
        //4.
        String c;
        String m = "The Gettysburg Address";
        c = m.substring(4);
        System.out.println(c);
        
        // 5.
        String b = "Four score and seven years ago,";
        String c1 = b.substring(7, 12);
        System.out.println(c1);
        
        // 6.
        int count;
        String st = "surface tension";
        count = st.length();
        System.out.println(count);
        
        // 7.
        String view = "Look here!";
        int len = view.length();
        System.out.println("\"" + view + "\"" + " has " + len + " characters.");
        
        // 8.
        System.out.println("All \"good\" men");
        
        // 9.
        System.out.println("Hello\nHello again");
        
        // 10.
        System.out.println("backslash looks like \\, right?");
        
        // 11.
        String pq = "Eddie Haskel";
        int hm = pq.length();
        String ed = pq.substring(hm - 4);
        System.out.println(ed);
        
    }
}