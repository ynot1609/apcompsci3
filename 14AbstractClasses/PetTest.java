public class PetTest
{
    public static void main(String[] args)
    {
        Pet maddie = new Dog("Maddie", 45);
        Pet sam = new Snake("Sam", 30);
        
        System.out.println(maddie);
        System.out.println(maddie.getName() + " says " + maddie.speak());
        System.out.println(maddie.getName() + " " + maddie.move());
        System.out.println(((Dog) maddie).getWeight());
        
        System.out.println(sam);
        System.out.println(sam.getName() + " says " + sam.speak());
        System.out.println(sam.getName() + " " + sam.move());
        System.out.println(((Snake) sam).getLength());
        
        Dog fido = new Dog("Fido", 25);
        System.out.println(fido.getName());
        System.out.println(fido.speak());
        System.out.println(fido.move());
        System.out.println(fido.getWeight());
    }
}