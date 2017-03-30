public class HiddenWordTest
{
    public static void main(String[] args)
    {
        HiddenWord puzzle = new HiddenWord("HARPS");
        String answer = "";
        answer = puzzle.getHint("AAAAA");
        System.out.println(answer);
        answer = puzzle.getHint("HELLO");
        System.out.println(answer);
        answer = puzzle.getHint("HEART");
        System.out.println(answer);
        answer = puzzle.getHint("HARMS");
        System.out.println(answer);
        answer = puzzle.getHint("HARPS");
        System.out.println(answer);
    }
}