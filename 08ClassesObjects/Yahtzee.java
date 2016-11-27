public class Yahtzee
{
    // instance variables
    private Die[] dice;
    
    // constructors
    public Yahtzee()
    {
        dice = new Die[5];
        
        for (int i = 0; i < dice.length; i++)
        {
            dice[i] = new Die();
        }
    }
    
    // methods
    public void rollDice()
    {
        for (int i = 0; i < dice.length; i++)
        {
            Die die = dice[i];
            die.roll();
        }
    }
    
    public String toString()
    {
        String result = "";
        for (int i = 0; i < dice.length; i++)
        {
            Die die = dice[i];
            result += die.getFaceValue() + " ";
        }
        return result;
    }
}