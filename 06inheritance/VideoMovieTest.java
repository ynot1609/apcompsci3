public class VideoMovieTest
{
    public static void main(String[] args)
    {
        Video v = new Video("Friends", 30);
        Movie m = new Movie("Avatar", 190, "Cameron", "PG");
        Video mars = new Movie("The Martian", 150, "Ridley", "PG");
        boolean result = false;
        result = ((Movie) mars).isLongMovie();
        System.out.println("Long movie? " + result);
        System.out.println(mars);
    }
}