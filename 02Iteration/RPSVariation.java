public class RPSVariation
{
    public static void main(String[] args)
    {
        int player1 = 2;
        int player2 = 1;
        
        if (player1 == player2)
        {
            System.out.println("Tie!");
        }
        else if (player1 == 0 && player2 == 2 || player1 == 2 && player2 == 1 || player1 == 1 && player2 == 0)
        {
            System.out.println("Player 1 wins!");
        }
        else
        {
            System.out.println("Player 2 wins!");
        }
    }
}