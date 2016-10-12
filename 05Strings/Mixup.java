public class Mixup
{
    public static void main(String[] args)
    {
        // watermelon --> melonwater
        String fruit = "watermelon";
        int letters = fruit.length();
        System.out.println(letters);
        int midpoint = letters/2;
        System.out.println(midpoint);
        
        String first = fruit.substring(0, midpoint);
        String second = fruit.substring(midpoint);
        String result = second + first;
        System.out.println(result);
    }
}