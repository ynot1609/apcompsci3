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
        
    }

    public int removeVariety(String cookieVar)
    {
        // YOUR CODE HERE
        
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
