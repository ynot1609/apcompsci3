public class HiddenWord
{
    // YOUR CODE HERE
    private String word;
    
    public HiddenWord(String w)
    {
        word = w;
    }
    
    public String getHint(String guess)
    {
        String result = "";
        for (int i = 0 ; i < word.length(); i++)
        {
            String gletter = guess.substring(i, i+1);
            String wletter = word.substring(i, i+1);
            if (gletter.equals(wletter))
            {
                result += wletter;
            }
            else if (word.indexOf(gletter) != -1)
            {
                result += "+";
            }
            else
            {
                result += "*";
            }
        }
        return result;
    }
}