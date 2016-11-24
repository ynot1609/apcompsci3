public class Dance
{
    // instance variables
    private int attendance;
    private int ticketSales;
    
    // constructors
    public Dance()
    {
        attendance = 0;
        ticketSales = 0;
    }
    
    // accessor methods
    public int getAttendance()
    {
        return attendance;
    }
    
    public double getTicketSales()
    {
        return ticketSales;
    }
    
    // mutator methods
    public void buyTicket(Ticket billet)
    {
        ticketSales += billet.getPrice();
        attendance++;
    }
    
    // toString() method
    public String toString()
    {
        String result = "";
        result += "Ticket sales: " + ticketSales + "\n";
        result += "Attendance: " + attendance;
        return result;
    }
}