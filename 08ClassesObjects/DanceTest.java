public class DanceTest
{
    public static void main(String[] args)
    {
        Ticket t1 = new Ticket("Gold", 0.0);
        Ticket t2 = new Ticket("Silver", 2.0);
        Ticket t3 = new Ticket("Bronze", 4.0);
        Ticket t4 = new Ticket("No Pass", 6.0);
        
        Dance disco = new Dance();
        disco.buyTicket(t1);
        disco.buyTicket(t2);
        disco.buyTicket(t3);
        disco.buyTicket(t4);
        System.out.println(disco);
    }
}