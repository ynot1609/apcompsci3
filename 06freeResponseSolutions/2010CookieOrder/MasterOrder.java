//----------------------------------------------------------
// File Name:	MasterOrder.java
// Description:	Maintains a list of the cookies to be purchased.
// Programmer:	Alwin Tareen
// Last Edited:	Dec 19, 2014
// OS Platform:	Linux Mint Maya 13, Java SE Development Kit 7
//
// Compilation:	javac MasterOrder.java
// Execution:	<non-executable>
//----------------------------------------------------------
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
        int totalBoxes = 0;
        for (CookieOrder item : orders)
            totalBoxes += item.getNumBoxes();
        return totalBoxes;
    }

    public int removeVariety(String cookieVar)
    {
        int boxesRemoved = 0;
        //for (int i = 0; i < orders.size(); i++)
        for (int i = orders.size()-1; i >= 0; i--)
        {
            if (cookieVar.equals((orders.get(i)).getVariety()))
            {
                boxesRemoved += (orders.get(i)).getNumBoxes();
                orders.remove(i);
            }
        }
        return boxesRemoved;
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

