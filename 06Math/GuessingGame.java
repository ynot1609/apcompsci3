import java.util.*;
public class GuessingGame
{
    public static void main(String[] args)
    {
        int tries = 3;
        int target = 0;
        int guess = 0;
        boolean winningCondition = false;
        Scanner scan = new Scanner(System.in);
        
        target = (int)(Math.random() * 10) + 1;
        System.out.println("I am thinking of a number from 1 to 10.");
        System.out.println("You must guess it in 3 tries.");
        
        while (tries > 0 && target != guess)
        {
            System.out.println("Enter a guess:");
            guess = scan.nextInt();
            if (target == guess)
            {
                winningCondition = true;
                System.out.println("Right!");
            }
            else
            {
                tries--;
                System.out.println("Wrong guess");
            }
        }
        
        if (winningCondition == true)
        {
            System.out.println("You have won the game");
        }
        else
        {
            System.out.println("You have lost the game");
        }
    }
}