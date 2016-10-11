public class Acronym
{
    public static void main(String[] args)
    {
        String first = "Random";
        String second = "Access";
        String third = "Memory";
        
        String result = "";
        result += first.substring(0, 1);
        result += second.substring(0, 1);
        result += third.substring(0, 1);
        System.out.println(result);
    }
}