public class WrapperClasses
{
    public static void main(String[] args)
    {
        // create an object called dozen of type Integer
        Integer dozen = new Integer(12);
        System.out.println(dozen);
        
        // create an object called acre of type Integer
        Integer acre = 48;
        System.out.println(acre);
        
        // unboxing
        int a = acre.intValue();
        System.out.println(a);
        
        // equals method
        boolean parity;
        parity = dozen.equals(acre);
        System.out.println(parity);
        
        boolean same;
        same = dozen.equals(a);
        System.out.println(same);
        
        // compareTo method
        int d = dozen.compareTo(acre);
        System.out.println(d);
        
        // can you multiply object?
        // yes, because of auto-unboxing
        int landplot = dozen * acre;
        System.out.println(landplot);
        
        
    }
}