import java.util.List;
import java.util.ArrayList;

public class MasterOrder
{
    private List<CookieOrder> orders;
    
    public MasterOrder()
    {
        orders = new ArrayList<CookieOrder>();
    }
    
    public void addOrder(CookieOrder theOrder)
    {
        orders.add(theOrder);
    }

    public int getTotalBoxes()
    {
        // YOUR CODE HERE
        int totalBoxes = 0;
        for (CookieOrder item : orders)
        {
            totalBoxes += item.getNumBoxes();
        }
        return totalBoxes;
    }

    public int removeVariety(String cookieVar)
    {
        // YOUR CODE HERE
        int cookiesRemoved = 0;
        CookieOrder keebler = null;
        for (int i = orders.size()-1; i >= 0; i--)
        {
            keebler = orders.get(i);
            if (keebler.getVariety().equals(cookieVar))
            {
                cookiesRemoved += keebler.getNumBoxes();
                orders.remove(i);
            }
        }
        return cookiesRemoved;
    }
    
    public String toString()
    {
        String cookieDisplay = "";
        for (CookieOrder item : orders)
        {
            cookieDisplay += item.getVariety() + " ";
            cookieDisplay += item.getNumBoxes() + "\n";
        }
        return cookieDisplay;
    }
}
