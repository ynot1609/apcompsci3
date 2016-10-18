public class BPLessonThree
{
    public static void main(String[] args)
    {
        // Question 1.
        String s = "The number of rabbits is";
        int argh = 129;
        String report = s + " " + 129 + ".";
        System.out.println(report);
        
        // Question 2.
        String p = "Groovy Dude";
        System.out.println(p.toUpperCase());
        
        // Question 3.
        String g = "Computer Science is for nerds.";
        System.out.println(g.toLowerCase());
        
        // Question 4.
        String c;
        String m = "The Gettysburg Address";
        c = m.substring(4);
        System.out.println(c);
        
        // Question 5.
        String b = "Four score and seven years ago";
        String d = b.substring(7, 12);
        System.out.println(d);
    }
}