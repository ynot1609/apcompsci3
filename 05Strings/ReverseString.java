public class ReverseString
{
    public static String reverse(String text)
    {
        // YOUR CODE HERE
        String output = "";
        int letters = text.length();
        for (int i = letters; i >= 1; i--)
        {
            output = output + text.substring(i-1, i);
        }
        return output;
    }
    
    public static boolean palindrome(String word)
    {
        String backwards = reverse(word);
        boolean outcome;
        if (backwards.equals(word))
        {
            outcome = true;
        }
        else
        {
            outcome = false;
        }
        return outcome;
    }
    
    public static void main(String[] args)
    {
        String result = reverse("example");
        System.out.println(result);
        boolean solution = palindrome("rotator");
        System.out.println(solution);
        boolean verify = palindrome("pizza");
        System.out.println(verify);
    }
}