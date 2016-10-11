public class SearchString
{
    public static void main(String[] args)
    {
        // Searching for and individual character
        String pal = "friend";
        int position = pal.indexOf("e");
        System.out.println(position);
        
        // Searching for a substring
        String fruit = "strawberry";
        int part = fruit.indexOf("raw");
        System.out.println(part);
        
        // The substring is not in the search string
        String lunch = "pizza";
        int location = lunch.indexOf("cola");
        System.out.println(location);
    }
    
}