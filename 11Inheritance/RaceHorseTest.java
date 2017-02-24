public class RaceHorseTest
{
    public static void main(String[] args)
    {
        RaceHorse secretariat = new RaceHorse("Alice", 3, 2500, 2);
        System.out.println(secretariat);
        
        System.out.println();
        
        RaceHorse affirmed = new RaceHorse("Bob", 4, 3500, 8);
        System.out.println(affirmed);
    }
}