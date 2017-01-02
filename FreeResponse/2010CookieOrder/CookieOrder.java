public class CookieOrder
{
    private String cookieVariety;
    private int cookieBoxes;
    
    public CookieOrder(String variety, int numBoxes)
    {
        cookieVariety = variety;
        cookieBoxes = numBoxes;
    }

    public String getVariety()
    {
        return cookieVariety;
    }

    public int getNumBoxes()
    {
        return cookieBoxes;
    }
}
