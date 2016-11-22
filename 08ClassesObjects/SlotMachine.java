public class SlotMachine
{
    // instance variables
    private int roller1;
    private int roller2;
    private int roller3;
    private String[] fruits;
    
    // constructors
    public SlotMachine()
    {
        roller1 = 0;
        roller2 = 0;
        roller3 = 0;
        //fruits = {"Cherries", "Apple", "Orange", "Lemon", "Banana"};
        fruits = new String[5];
        fruits[0] = "Cherries";
        fruits[1] = "Apple";
        fruits[2] = "Orange";
        fruits[3] = "Lemon";
        fruits[4] = "Banana";
    }
    
}