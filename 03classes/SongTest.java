public class SongTest
{
    public static void main(String[] args)
    {
        Song badblood = new Song("Bad Blood", "Taylor Swift");
        System.out.println(badblood.popularMusic());
        System.out.println(badblood.popularMusic(9.95, 5628));
        System.out.println(badblood.popularMusic(2584));
        System.out.println(badblood.popularMusic(894,148));
    }
}