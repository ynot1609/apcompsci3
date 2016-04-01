import java.util.*;

public class Scramble
{
    public static String scrambleWord(String word)
    {
        // YOUR CODE HERE
        String result = "";
        for (int pos = 0; pos < word.length()-1; pos++)
        {
            String first = word.substring(pos, pos+1);
            String second = word.substring(pos+1, pos+2);
            if (first.equals("A") && !second.equals("A"))
            {
                result += second + "A";
                pos++;
            }
            else
            {
                result += first;
            }
        }
        if (word.length() > 0)
        {
            result += word.substring(word.length()-1);
        }
        return result;
    }

    public static void scrambleOrRemove(List<String> wordList)
    {
        // YOUR CODE HERE
        
    }

    public static void main(String[] args)
    {
        System.out.println(scrambleWord("TAN"));
        System.out.println(scrambleWord("ABRACADABRA"));
        System.out.println(scrambleWord("WHOA"));
        System.out.println(scrambleWord("AARDVARK"));
        System.out.println(scrambleWord("EGGS"));
        System.out.println(scrambleWord("A"));
        System.out.println(scrambleWord(""));

        List<String> wordGroup = new ArrayList<String>();
        wordGroup.add("TAN");
        wordGroup.add("ABRACADABRA");
        wordGroup.add("WHOA");
        wordGroup.add("APPLE");
        wordGroup.add("EGGS");
        System.out.println(wordGroup);
        scrambleOrRemove(wordGroup);
        System.out.println(wordGroup);
    }
}