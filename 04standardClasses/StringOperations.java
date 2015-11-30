public class StringOperations
{
    public static void main(String[] args)
    {
        String ashton = "Dude, Where's My Car?";
        String kutcher = ashton.toLowerCase();
        System.out.println(kutcher);
        
        String sean = ashton.toUpperCase();
        System.out.println(sean);
        
        // escape sequences
        String potter = "Harry attends \"Hogwarts\" Academy";
        System.out.println(potter);
        
        String menu = "pizza\nburger\nfries\nsoda";
        System.out.println(menu);
        
        System.out.println("c:\\Docs\\programming\\Recipe.java");
        System.out.println("Name:\tAddress:\tPhone:");
        
        // use equals() to compare Strings
        String snack = "pizza";
        String meal = "pizza";
        System.out.println(snack.equals(meal));
        String lunch = "hamburger";
        String dinner = "salad";
        System.out.println(lunch.equals(dinner));
        
        String phone = "867";
        String big = "LARGE";
        String small = "little";
        System.out.println(phone.compareTo(big));
        System.out.println(big.compareTo(small));
        System.out.println(small.compareTo(big));
        System.out.println(small.compareTo(phone));
        
        String supper = "double cheeseburger";
        System.out.println(supper.indexOf("cheese"));
        System.out.println(supper.indexOf("pizza"));
        
    }
}