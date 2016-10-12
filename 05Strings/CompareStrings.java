public class CompareStrings
{
    public static void main(String[] args)
    {
        String phrase = "A";
        String sentence = "c";
        int result = phrase.compareTo(sentence);
        System.out.println(result);
        
        String letter = "g";
        String character = "T";
        int outcome = letter.compareTo(sentence);
        System.out.println(outcome);
        
        String number = "34298";
        String lunch = "pizza";
        int solution = number.compareTo(lunch);
        System.out.println(solution);
        
        String place = "hotel";
        String dinner = "hotdog";
        int out = place.compareTo(dinner);
        System.out.println(out);
        
        String drink = "water";
        String beverage = "water";
        int num = drink.compareTo(beverage);
        System.out.println(num);
    }
}