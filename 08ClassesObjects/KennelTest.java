public class KennelTest
{
    public static void main(String[] args)
    {
        Dog fido = new Dog("Fluffy", "Poodle");
        Kennel pound = new Kennel();
        pound.addDogs(0, fido);
        System.out.println(pound);
    }
}