//----------------------------------------------------------
// File Name:	Scramble.java
// Description:	2014 free response question 1a)
// Programmer:	Alwin Tareen
// Last Edited:	Nov 24, 2014
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac Scramble.java
// Execution:	java Scramble
//----------------------------------------------------------

public class Scramble
{
    public static String scrambleWord(String word)
    {
        String result = "";
        int i = 0;
//        for (int i = 0; i < len; i++)
        while (i < word.length()-1)
        {
            if (word.substring(i,i+1).equals("A") && !word.substring(i+1,i+2).equals("A"))
            {
                result += word.substring(i+1,i+2);
                result += "A";
                i += 2;
            }
            else
            {
                result += word.substring(i,i+1);
                i++;
            }
        }
        // This appends the last bit of the word
        if (i < word.length())
        {
            result += word.substring(i);
        }

        return result;
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
    }
}

