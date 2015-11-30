public class NameThatCelebrity
{
    public static void main(String[] args)
    {
        String s1 = "Allan Alda";
        String s2 = "John Wayne";
        String s3 = "Gregory Peck";
    
        int size1 = s1.length();
        int size2 = s2.length();
        int size3 = s3.length();
        
        String part1 = s1.substring(2,(size1-3));
        String part2 = s2.substring(2,(size2-3));
        String part3 = s3.substring(2,(size3-3));
        
        System.out.println(s1 + ">>>" + part1);
        System.out.println(s2 + ">>>" + part2);
        System.out.println(s3 + ">>>" + part3);
        
    }
}