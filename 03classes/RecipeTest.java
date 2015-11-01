public class RecipeTest
{
    public static void main(String[] args)
    {
        Recipe p = new Recipe("Pizza", 5.25, 756);
        Recipe s = new Recipe("Salad", 3.75, 218);
        
        System.out.println(p);
        System.out.println(s);
    
        Recipe q = null;
        q = p;
        System.out.println(q);
        q.changeCost(8.45);
        System.out.println( p.getCost() );
        
    }
}