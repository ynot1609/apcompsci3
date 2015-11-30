public class RandomValues
{
    public static void main(String[] args)
    {
        // scaling
        // range 0.0 <= spin < 6.0
        double spin = 6 * Math.random();
        System.out.println(spin);
        
        // shifting
        // range 2.0 <= slot < 3.0
        double slot = Math.random() + 2;
        System.out.println(slot); 
        
        // scaling and shifting
        // range 4.0 <= roll < 6.0
        double roll = 2 * Math.random() + 4;
        System.out.println(roll);
        
        // range 0 to 99
        // k = 100
        int num = (int) (Math.random()*100);
        System.out.println(num);
        
        // range 1 to 100
        // p = 1, k = 100
        int val = (int) (Math.random()*100) + 1;
        System.out.println(val);
        
        
    }
}