public class RPS
{
    public static void main(String[] args)
    {
        int player1 = 1;
        int player2 = 2;
        
        if (player1 == player2)
        {
            System.out.println("Tie!");
        }
        else if (player1 == 0 && player2 == 2)
        {
            System.out.println("Player 1 wins!");
        }
        else if (player1 == 2 && player2 == 1)
        {
            System.out.println("Player 1 wins!");
        }
        else if (player1 == 1 && player2 == 0)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Player 2 wins!");
        }
    }
}